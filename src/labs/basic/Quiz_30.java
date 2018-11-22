package labs.basic;

import java.util.Scanner;

public class Quiz_30 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[n][n];
    int k = 0;

    for (int v = 0; v < n * 2; v++) {
      for (int i = 0; i < array.length; i++) {
        int j = v - i;
        if (j >= 0 && j < n) {
          k = k + 1;
          array[i][j] = k;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

  }
}
