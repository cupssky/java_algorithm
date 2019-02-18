package programmers.hash;

import java.util.HashMap;

/*
    |--------------------------------------------------------------------------
    | Note. 완주하지 못한 선수
    |--------------------------------------------------------------------------
*/
public class Quiz_01 {

  public static void main(String[] args) {
    String[] participant = {"leo", "kiki", "eden"};
    String[] completion = {"eden", "kiki"};
    System.out.print(solution(participant, completion));
  }

  public static String solution(String[] participant, String[] completion) {
    String answer = "";
    HashMap<String, Integer> map = new HashMap<>();

    for (int i = 0; i < participant.length; i++) {
      if (map.get(participant[i]) == null) {
        map.put(participant[i], 1);
      } else {
        int value = map.get(participant[i]) + 1;
        map.put(participant[i], value);
      }
    }

    for (int i = 0; i < completion.length; i++) {
      map.put(completion[i], map.get(completion[i]) - 1);
    }

    for (String value : map.keySet()) {
      if (map.get(value) == 1) {
        answer = value;
      }
    }
    return answer;
  }
}
