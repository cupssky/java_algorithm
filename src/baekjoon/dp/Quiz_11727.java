package baekjoon.dp;

import java.util.Scanner;

public class Quiz_11727 {

  private static int[] d;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    d = new int[1001];
    System.out.println(go(n));
  }

  private static int go(int n) {
    if (n <= 1) {
      return 1;
    } else if (d[n] > 0) {
      return d[n];
    } else {
      d[n] = 2 * go(n - 2) + go(n - 1);
      d[n] = d[n] % 10007;
      return d[n];
    }
  }
}
