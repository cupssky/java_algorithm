package doit.chap01;

import java.util.Scanner;

public class Median {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(med(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
  }

  static int med(int a, int b, int c) {
    if (a >= b) {
      if (b >= c) {
        return b;
      } else if (a <= c) {
        return a;
      } else {
        return c;
      }
    } else if (a > c) {
      return a;
    } else if (b > c) {
      return c;
    } else {
      return b;
    }
  }
}
