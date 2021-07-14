package programmers.level1;

import java.util.ArrayList;
import java.util.List;

/*
    |--------------------------------------------------------------------------
    | Note. 두개 뽑아서 더하기
    |--------------------------------------------------------------------------
*/
public class Quiz_08 {

  public static void main(String[] args) {
    System.out.println(solution("abcde"));
  }

  public static String solution(String s) {
    StringBuilder builder = new StringBuilder();

    int lengthValue = s.length() / 2;
    char[] c = s.toCharArray();
    if (s.length() % 2 == 0) {
      return builder.append(c[lengthValue - 1])
                    .append(c[lengthValue]).toString();
    } else {
      return builder.append(c[lengthValue]).toString();
    }
  }
}
