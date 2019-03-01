package baekjoon.math;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 최소공배수
    |--------------------------------------------------------------------------
*/
public class Quiz_1934 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      System.out.println(a * b / ucd(a, b));
    }
  }

  private static int ucd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return ucd(b, a % b);
    }
  }


}
