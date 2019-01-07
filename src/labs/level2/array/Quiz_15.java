package labs.level2.array;

import java.util.Scanner;

public class Quiz_15 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[n][n];
    int k = 0;

    // 0 0 0 1
    // 1 0
    // 0 0 0
    for (int i = 0; i < n * 2; i++) {
      for (int j = 0; j < array.length; j++) {
        int value = i - j;
        if (value >= 0 && value < n) {
          k++;
          array[j][value] = k;
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