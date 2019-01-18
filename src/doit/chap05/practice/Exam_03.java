package doit.chap05.practice;

import java.util.Scanner;

public class Exam_03 {

  static int n;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }

    System.out.print(gcdArray(a, 0, n));
  }

  private static int gcd(int a, int b) {
    while (b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  private static int gcdArray(int[] a, int start, int n) {
    if (n == 1) {
      return a[start];
    } else if (n == 2) {
      return gcd(a[start], a[start + 1]);
    } else {
      return gcd(a[start], gcdArray(a, start + 1, n - 1));
    }
  }
}
