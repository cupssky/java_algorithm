package baekjoon.fibo;

import java.util.Scanner;

public class Quiz_1003 {

  static int count0 = 0;
  static int count1 = 0;
  static int[] memo;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    memo = new int[n + 1];

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }
    for (int i = 0; i < n; i++) {
      fibonacci(array[i]);
      System.out.println(count0 + " " + count1);
      count1 = 0;
      count0 = 0;
    }
  }

  private static int fibonacci(int n) {
    if (n == 0) {
      count0++;
      return 0;
    } else if (n == 1) {
      count1++;
      return 1;
    } else if (memo[n] != 0) {
      return memo[n];
    } else {
      memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
      return memo[n];
    }
  }
}
