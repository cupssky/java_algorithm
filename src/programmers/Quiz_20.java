package programmers;

import java.util.Arrays;

//정수 내림차순으로 배치하기
public class Quiz_20 {

  public static void main(String[] args) {
    System.out.print(solution(118372));
  }

  private static long solution(long n) {
    String str = Long.toString(n);
    char[] c = str.toCharArray();
    Arrays.sort(c);
    StringBuilder sb = new StringBuilder(new String(c, 0, c.length));
    return Integer.parseInt(((sb.reverse()).toString()));
  }
}
