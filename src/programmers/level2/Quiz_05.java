package programmers.level2;

import java.util.Arrays;

public class Quiz_05 {

  public static void main(String[] args) {
    int[] A = {1, 2};
    int[] B = {3, 4};
    System.out.println(solution(A, B));
  }

  public static int solution(int[] A, int[] B) {
    int answer = 0;
    Arrays.sort(A);
    Arrays.sort(B);
    reverse(B);

    for (int i = 0; i < A.length; i++) {
      answer += A[i] * B[i];
    }
    return answer;
  }

  private static void reverse(int[] B) {
    for (int i = 0; i < B.length / 2; i++) {
      int temp = B[i];
      B[i] = B[B.length - 1 - i];
      B[B.length - 1 - i] = temp;
    }
  }
}
