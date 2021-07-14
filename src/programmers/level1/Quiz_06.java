package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    |--------------------------------------------------------------------------
    | Note. 두개 뽑아서 더하기
    |--------------------------------------------------------------------------
*/
public class Quiz_06 {

  public static void main(String[] args) {
    //String[] participant = {"leo", "kiki", "eden"};
    //String[] completion = {"eden", "kiki"};

    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"stanko", "ana", "mislav"};

    solution(participant, completion);
  }

  public static String solution(String[] participant, String[] completion) {
    Map<String, String> map = new HashMap<>();
    List<String> completions = Stream.of(completion).collect(Collectors.toList());

    for (String joiner : participant) {
      if (completions.indexOf(joiner) == -1) {
        map.put("fail", joiner);
      } else {
        completions.remove(joiner);
      }
    }

    return map.get("fail");
  }
}
