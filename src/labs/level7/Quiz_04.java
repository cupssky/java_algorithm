package labs.level7;

import java.util.Scanner;

//tobin 백트래킹 문제 중요!
public class Quiz_04 {

  public static int[] ans = new int[30];
  private static int N;
  private static int K;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    K = sc.nextInt();
    tobin(N, K, 0);
  }

  // n자릿수 1이 k개인 경우의 수
  private static void tobin(int n, int k, int index) {
    if (N == index) { // 인덱스가 자릿수만큼 채워질 경우 출력
      for (int i = 0; i < index; i++) {
        System.out.print(ans[i]);
      }
      System.out.println();
      return;
    } else { // 처음 시작은 1_ _ _ 경우와 0_ _ _ 인 경우로 생각
      if (k > 0) {
        ans[index] = 1;
        tobin(n - 1, k - 1, index + 1);
      }
      if (n - k > 0) { // 자리수 - 1의 갯수
        ans[index] = 0;
        tobin(n - 1, k, index + 1);
      }
    }
  }
}
