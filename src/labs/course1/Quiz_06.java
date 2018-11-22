package labs.course1;

import java.util.Scanner;

public class Quiz_06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] array = new int[n][m];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = scanner.nextInt();
      }
    }
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length / 2; j++) {
        int temp = array[i][j];
        // 0 0 = 0 3    0 1 = 0 2   0 2 0 1
        array[i][j] = array[i][array[i].length - j - 1];
        array[i][array[i].length - j - 1] = temp;
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
