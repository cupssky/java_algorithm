package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

/*
    |--------------------------------------------------------------------------
    | Note. 내마음대로 문자 정렬하기
    |--------------------------------------------------------------------------
*/
public class Quiz_03 {

  public static void main(String[] args) {
    String[] strings = {"sun", "bed", "car"};
    int n = 1;
    System.out.print(solution(strings, n));
  }

  public static String[] solution(String[] strings, int n) {
    String[] answer = {};
    Arrays.sort(strings, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.charAt(n) == o2.charAt(n)) {
          return o1.compareTo(o2);
        } else {
          return o1.substring(n, n + 1).compareTo(o2.substring(n, n + 1));
        }
      }
    });
    answer = strings.clone();
    return answer;
  }
}
