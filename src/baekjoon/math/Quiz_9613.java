package baekjoon.math;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. GCD 합
    |--------------------------------------------------------------------------
*/
public class Quiz_9613 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
      long sum = 0;
      int n = scanner.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = scanner.nextInt();
      }
      for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
          sum += ucd(a[i], a[j]);
        }
      }
      System.out.println(sum);
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
