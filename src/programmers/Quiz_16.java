package programmers;

import java.util.Arrays;

//제일 작은수 제거하기
public class Quiz_16 {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4};
    System.out.print(solution(arr));
  }

  private static int[] solution(int[] arr) {
    if (arr.length > 1) {
      return Arrays.stream(arr).filter(value -> value != Arrays.stream(arr).min().getAsInt())
          .toArray();
    } else {
      return new int[]{-1};
    }
  }
}
