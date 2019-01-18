package baekjoon.dp;

import java.util.Scanner;

public class Quiz_1699 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] d = new int[n + 1];

    for (int i = 1; i <= n; i++) {
      d[i] = i;
      for (int j = 1; j * j <= i; j++) {
        d[i] = Math.min(d[i], d[i - j * j] + 1);
      }
    }

    System.out.print(d[n]);
  }
}
