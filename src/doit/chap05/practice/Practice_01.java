package doit.chap05.practice;

import java.util.Scanner;

public class Practice_01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(factorial(scanner.nextInt()));
  }

  static int factorial(int n) {
    int fact = 1;
    while (n > 1) {
      fact *= n--;
    }
    return fact;
  }
}
