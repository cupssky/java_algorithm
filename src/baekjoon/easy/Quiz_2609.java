package baekjoon.easy;

import java.util.Scanner;

public class Quiz_2609 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int tmp1, tmp2;
    tmp1 = a;
    tmp2 = b;

    if (a < b) {
      a = tmp2;
      b = tmp1;
    }
    calc(a, b);
  }

  static void calc(int a, int b) {
    while (b > 0) {
      a = b;
      b = a % b;
    }
  }
}
