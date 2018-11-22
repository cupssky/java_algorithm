package doit.chap01.practice;

import java.util.Scanner;

public class Practice_09 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(sumOf(a, b));
  }

  static int sumOf(int a, int b) {
    int sum = 0;
    for (; a <= b; a++) {
      sum += a;
    }
    return sum;
  }

}
