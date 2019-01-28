package baekjoon.bsearch;

import java.util.Scanner;

public class Quiz_1654 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    long[] a = new long[n];

    long max = 0;
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextLong();
      max = Math.max(max, a[i]);
    }

    long result = 0;
    long l = 1;
    long r = max;

    while (l <= r) {
      long mid = (l + r) / 2;
      if (check(a, m, mid)) {
        result = Math.max(result, mid);
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
    System.out.print(result);
  }

  private static boolean check(long[] a, int m, long x) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      count += a[i] / x;
    }
    return count >= m;
  }
}
