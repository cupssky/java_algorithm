package baekjoon.math;

import java.util.Scanner;

public class Quiz_1934 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      array[i] = (a * b) / ucd(a, b);
    }

    for (int i = 0; i < n; i++) {
      System.out.println(array[i]);
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
