package doit.chap05;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

  }

  static int factorial(int n) {
    if (n > 0) {
      n = n * factorial(n - 1);
      return n;
    } else {
      return 1;
    }
  }

}
