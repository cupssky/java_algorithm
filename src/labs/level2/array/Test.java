package labs.level2.array;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[n][n];
    int value = 0;
    int k = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        value = i - j;
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
