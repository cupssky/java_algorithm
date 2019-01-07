package baekjoon.ucd;

import java.util.Scanner;

public class Quiz_1850 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    for (int i = 0; i < ucd(a, b); i++) {
      stringBuilder.append(1);
    }
    System.out.print(stringBuilder.toString());
  }

  private static long ucd(long a, long b) {
    if (b == 0) {
      return a;
    } else {
      return ucd(b, a % b);
    }
  }
}
