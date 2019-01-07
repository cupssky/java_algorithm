package baekjoon.math;

import java.util.Scanner;

public class Quiz_11653 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 2; i * i <= n; i++) {
      while (n % i == 0) {
        System.out.println(i);
        n = n / i;
      }
    }
    if (n > 1) {
      System.out.println(n);
    }
  }
}
