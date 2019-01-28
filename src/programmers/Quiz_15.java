package programmers;

import java.util.Arrays;

//평균 구하기
public class Quiz_15 {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4};
    System.out.print(solution(arr));
  }

  private static double solution(int[] arr) {
    return Arrays.stream(arr).average().orElse(0);
  }
}
