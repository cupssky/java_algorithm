package doit.chap05.practice;

import java.util.Scanner;

public class Practice_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(gcd(scanner.nextInt(), scanner.nextInt()));
  }

  static int gcd(int x, int y) {
    while (y != 0) {
      int temp = y;
      y = x % y;
      x = temp;
    }
    return x;
  }
}
