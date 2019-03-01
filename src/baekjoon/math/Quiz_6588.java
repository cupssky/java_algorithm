package baekjoon.math;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 골든바흐의 추측
    |--------------------------------------------------------------------------
*/
public class Quiz_6588 {

  public static final int MAX = 1000000;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] a = new int[MAX + 1];
    a[1] = 1;

    for (int i = 2; i * i <= MAX; i++) {
      for (int j = 2; j * i <= MAX; j++) {
        a[i * j] = 1;
      }
    }

    while (true) {
      int n = scanner.nextInt();
      boolean flag = false;
      if (n == 0) {
        break;
      }
      for (int i = 2; i <= n / 2; i++) {
        if (a[i] != 1 && a[n - i] != 1) {
          System.out.println(n + " = " + i + " + " + (n - i));
          flag = true;
          break;
        }
      }
      if (!flag) {
        System.out.println("Goldbach's conjecture is wrong.");
      }
    }
  }
}
