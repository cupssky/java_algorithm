package baekjoon.fibo;

import java.util.Scanner;

public class Quiz_2748 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long[] memo = new long[91];
    System.out.print(fibo(n, memo));
  }

  private static long fibo(int n, long[] memo) {
    if (n <= 1) {
      return n;
    } else if (memo[n] != 0) {
      return memo[n];
    } else {
      memo[n] = fibo(n - 2, memo) + fibo(n - 1, memo);
      return memo[n];
    }
  }
}
