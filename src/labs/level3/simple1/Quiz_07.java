package labs.level3.simple1;

import java.util.Scanner;

//input
public class Quiz_07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[10][10];

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        array[i][j] = 0;
      }
    }

    // 0 0 0 1 0 2 0 3
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 10; j++) {
        if (array[i][j] == 0) {
          array[i][j] = 1;
        } else {
          array[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          continue;
        }
        if (array[i][j] == 0) {
          array[i][j] = 1;
        } else {
          array[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
