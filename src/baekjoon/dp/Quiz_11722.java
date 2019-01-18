package baekjoon.dp;

import java.util.Scanner;

public class Quiz_11722 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int[] save = new int[n];
    int max = 0;

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
      save[i] = 1;
      for (int j = 0; j < i; j++) {
        if (array[i] < array[j]) {
          save[i] = Math.max(save[i], save[j] + 1);
        }
      }
    }

    for (int i = 0; i < n; i++) {
      max = Math.max(max, save[i]);
    }
    System.out.print(max);

  }
}
