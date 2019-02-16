package baekjoon.bsearch;

import java.util.Scanner;

public class Study {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    long[] a = new long[n];

    long max = 0;

    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
      max = Math.max(max, a[i]);
    }

    long l = 1;
    long r = max;
//    while (l <= r) {
//      long mid = (l + r) / 2;
//      if () {
//        l = mid + 1;
//      } else {
//        r = mid - 1;
//      }
//    }
  }
}
