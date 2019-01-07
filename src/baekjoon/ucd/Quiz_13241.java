package baekjoon.ucd;

import java.util.Scanner;

public class Quiz_13241 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    System.out.print(a * b / ucd(a, b));
  }

  private static long ucd(long a, long b) {
    if (b == 0) {
      return a;
    } else {
      return ucd(b, a % b);
    }
  }
}
