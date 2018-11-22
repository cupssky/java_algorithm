package doit.chap01.practice;

import java.util.Scanner;

public class Practice_01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out
        .println(max4(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
  }

  static int max4(int a, int b, int c, int d) {
    int max = a;
    if (b > max) {
      max = b;
    }

    if (c > max) {
      max = c;
    }

    if (d > max) {
      max = d;
    }
    return max;
  }
}
