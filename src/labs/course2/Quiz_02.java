package labs.course2;

import java.util.Scanner;

public class Quiz_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] array = new int[10][10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        array[i][j] = 0;
      }
    }
    int n = scanner.nextInt();

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < n; j++) {
        if (array[i][j] == 0) {
          array[i][j] = 1;
        } else {
          array[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 10; j++) {
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
