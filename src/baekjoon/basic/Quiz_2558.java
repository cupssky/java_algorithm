package baekjoon.basic;

import java.util.Scanner;

public class Quiz_2558 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if (a > 0 && b < 10) {
      System.out.println(a + b);
    }
  }
}
