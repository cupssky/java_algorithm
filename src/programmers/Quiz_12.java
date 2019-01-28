package programmers;

import java.util.Arrays;

// 나누어 떨어지는 배열
public class Quiz_12 {

  public static void main(String[] args) {
    int[] arr = {3, 2, 6};
    System.out.print(solution(arr, 10));
  }

  private static int[] solution(int[] arr, int divisor) {
    int[] answer = {};

    answer = Arrays.stream(arr).filter(value -> value % divisor == 0).sorted().toArray();

    if (answer.length == 0) {
      answer = new int[]{-1};
    }

    return answer;
  }
}
