package baekjoon.ucd;

import java.util.Scanner;

public class Quiz_1934 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
      b[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
      System.out.println(a[i] * b[i] / ucd(a[i], b[i]));
    }
  }

  private static int ucd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return ucd(b, a % b);
    }
  }

}
