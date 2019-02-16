package programmers;

import java.util.Arrays;
import java.util.Comparator;

//문자열 마음대로 정렬하기 다시
public class Quiz_33 {

  public static void main(String[] args) {
    String[] strings = {"abce", "abcd", "cdx"};
    solution(strings, 2);
  }

  public static String[] solution(String[] strings, int n) {
    String[] answer = {};
    Arrays.sort(strings, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.split("")[n].compareTo(o2.split("")[n]);
      }
    });
    answer = strings.clone();
    for (int i = 0; i < answer.length; i++) {
      System.out.println(answer[i]);
    }
    return answer;
  }
}
