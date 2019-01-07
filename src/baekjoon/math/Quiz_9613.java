package baekjoon.math;

import java.util.Scanner;

public class Quiz_9613 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    while (n-- > 0) {
      long count = 0;
      int number = scanner.nextInt();
      int[] array = new int[number];
      for (int i = 0; i < number; i++) {
        array[i] = scanner.nextInt();
      }

      for (int i = 0; i < number - 1; i++) {
        for (int j = i + 1; j < number; j++) {
          count += ucd(array[i], array[j]);
        }
      }
      System.out.println(count);
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
