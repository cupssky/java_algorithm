package baekjoon.math;

import java.util.Scanner;

public class Quiz_2609 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(ucd(a, b));
    System.out.println(a * b / ucd(a, b));
  }

  private static int ucd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return ucd(b, a % b);
    }
  }
}
