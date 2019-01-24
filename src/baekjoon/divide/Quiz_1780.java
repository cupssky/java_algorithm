package baekjoon.divide;

import java.util.Scanner;

public class Quiz_1780 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] a = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = scanner.nextInt();
      }
    }
  }

  private static boolean check(int[][] a, int i, int j, int n) {
    for (int d = 0; d < n; i++) {
      for (int f = 0; f < n; j++) {
        if (a[d][f] != a[i][j]) {
          return false;
        }
      }
    }
    return true;
  }

  private static void solve(int[][] a, int[] result, int i, int j, int n) {

  }

}
