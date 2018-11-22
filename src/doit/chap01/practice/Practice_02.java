package doit.chap01.practice;

import java.util.Scanner;

public class Practice_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(min(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
  }

  static int min(int a, int b, int c) {
    int min = a;
    if (min > b) {
      min = b;
    }
    if (min > c) {
      min = c;
    }
    return min;
  }
}
