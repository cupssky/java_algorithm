package baekjoon.dp;

import java.util.Scanner;

public class Quiz_11057 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long[] d = new long[n + 1];
    d[1] = 1;
    for (int i = 2; i <= n; i++) {
      d[i] = d[i - 1] + d[i - 2];
    }
    System.out.print(d[n]);
  }
}
