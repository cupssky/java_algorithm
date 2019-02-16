package baekjoon.dp;

import java.util.Scanner;

public class Quiz_11053 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    int[] d = new int[n];
    int value = 0;

    for (int i = 0; i < n; i++) {
      d[i] = 1;
      for (int j = 0; j < i; j++) {
        if (array[j] < array[i]) {
          d[i] = Math.max(d[i], d[j] + 1);
        }
      }
      value = Math.max(value, d[i]);
    }

    System.out.print(value);
  }
}
