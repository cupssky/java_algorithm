package baekjoon.dp;

import java.util.Scanner;

public class Quiz_11052 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n + 1];
    int[] d = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      a[i] = scanner.nextInt();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (d[i] < d[i - j] + a[j]) {
          d[i] = d[i - j] + a[j];
        }
      }
    }
    System.out.println(d[n]);
  }
}
