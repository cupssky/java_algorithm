package doit.chap05;

import java.util.Scanner;

public class EuclidGCD {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("최대공약수 :" + gcd(scanner.nextInt(), scanner.nextInt()));
  }

  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }
}
