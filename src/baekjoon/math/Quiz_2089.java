package baekjoon.math;

import java.util.Scanner;

public class Quiz_2089 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    if (n == 0) {
      System.out.println(0);
    } else {
      go(n);
    }
  }

  private static void go(int n) {
    if (n == 0) {
      return;
    }
    if (n % 2 == 0) {
      go(-(n / 2));
      System.out.print(0);
    } else {
      if (n > 0) {
        go(-(n / 2));
      } else {
        go((-n + 1) / 2);
      }
      System.out.print(1);
    }
  }
}
