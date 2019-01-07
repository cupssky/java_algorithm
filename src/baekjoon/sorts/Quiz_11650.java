package baekjoon.sorts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Quiz_11650 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[n][2];

    for (int i = 0; i < n; i++) {
      array[i][0] = scanner.nextInt();
      array[i][1] = scanner.nextInt();
    }

    Arrays.sort(array, new Comparator<int[]>() {
      @Override
      public int compare(int[] x, int[] y) {
        if (x[0] == y[0]) {
          return Integer.compare(x[1], y[1]);
        } else {
          return Integer.compare(x[0], y[0]);
        }
      }
    });
    for (int i = 0; i < n; i++) {
      System.out.println(array[i][0] + " " + array[i][1]);
    }
    scanner.close();
  }
}

