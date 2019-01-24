package programmers;

import java.util.Arrays;

public class Quiz_08 {

  public static void main(String[] args) {
    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"stanko", "ana", "mislav"};
    System.out.print(solution(participant, completion));

  }

  public static String solution(String[] participant, String[] completion) {
    String answer = "";
    for (int i = 0; i < completion.length; i++) {
      if (Arrays.asList(participant).indexOf(completion[i]) == -1) {
        answer += completion[i];
      } else {
        int idx = i;
        long part = Arrays.stream(participant).filter(value -> value == completion[idx]).count();
        long result = Arrays.stream(completion).filter(value -> value == completion[idx]).count();
        if (part != result) {
          answer += completion[idx];
        }
      }
    }
    return answer;
  }
}
