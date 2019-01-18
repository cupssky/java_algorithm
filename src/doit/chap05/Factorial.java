package doit.chap05;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.print(factorial(n));

  }

  private static int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return factorial(n - 1) + n;
    }
  }
}
