package baekjoon.ucd;

import java.util.Scanner;

public class Quiz_3036 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    array[0] = scanner.nextInt();
    for (int i = 1; i < n; i++) {
      array[i] = scanner.nextInt();
    }
    for (int i = 1; i < n; i++) {
      System.out.print(array[0] / ucd(array[0], array[i]));
      System.out.print("/");
      System.out.println(array[i] / ucd(array[0], array[i]));

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
