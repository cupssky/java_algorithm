package baekjoon.dp;

import java.util.Scanner;

public class Quiz_9465 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
      int n = scanner.nextInt();
      int[][] d = new int[n + 1][2];

      for (int i = 1; i <= n; i++) {
        d[i][0] = scanner.nextInt();
      }

      for (int i = 1; i <= n; i++) {
        d[i][1] = scanner.nextInt();
      }
      
    }
  }
}
