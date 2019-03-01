package baekjoon.math;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 소수 구하기
    |--------------------------------------------------------------------------
*/
public class Quiz_1929 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int[] a = new int[n + 1];
    a[1] = 1;

    for (int i = 2; i * i <= n; i++) {
      for (int j = 2; i * j <= n; j++) {
        a[i * j] = 1;
      }
    }

    for (int i = m; i <= n; i++) {
      if (a[i] != 1) {
        System.out.print(i + " ");
      }
    }
  }
}
