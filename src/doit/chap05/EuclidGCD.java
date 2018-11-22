package doit.chap05;

import java.util.Scanner;

public class EuclidGCD {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("최대공약수 :" + gcd(scanner.nextInt(), scanner.nextInt()));
  }

  static int gcd(int x, int y) {
    if (y == 0) {
      return x;
    } else {
      return gcd(y, x % y);
    }
  }
}
