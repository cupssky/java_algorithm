package baekjoon.structure;

import java.util.Scanner;

public class Quiz_2193 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long[] d = new long[n];
    d[1] = 1;
    if (n >= 2) {
      d[2] = 0;
    }

    for (int i = 3; i < n; i++) {
      d[i] = d[i - 1] + d[i - 2];
    }
    System.out.println(d[n]);
  }
}
