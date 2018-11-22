package doit.chap01.practice;

import java.util.Scanner;

public class Practice_03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out
        .print(min4(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
  }

  static int min4(int a, int b, int c, int d) {
    int min = a;
    if (b < min) {
      min = b;
    }
    if (c < min) {
      min = c;
    }
    if (d < min) {
      min = d;
    }
    return min;
  }
}
