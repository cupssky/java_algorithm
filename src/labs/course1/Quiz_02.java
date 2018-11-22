package labs.course1;

import java.util.Scanner;

public class Quiz_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] array = new int[5][5];
    boolean up, down, left, right;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        array[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        up = false;
        down = false;
        left = false;
        right = false;
        // 좌측비교
        if (j != 0) {
          if (array[i][j] < array[i][j - 1]) { //좌측보다 작다면
            left = true;
          }
        } else {
          left = true;
        }
        // 우측비교
        if (j != 4) {
          if (array[i][j] < array[i][j + 1]) { //우측보다 작다면
            right = true;
          }
        } else {
          right = true;
        }
        // 위측비교
        if (i != 0) {
          if (array[i][j] < array[i - 1][j]) {//위측보다 작다면
            up = true;
          }
        } else {
          up = true;
        }
        // 아래측비교
        if (i != 4) {
          if (array[i][j] < array[i + 1][j]) {//아래측보다 작다면
            down = true;
          }
        } else {
          down = true;
        }

        if (up && down && left && right) {
          System.out.print("*" + " ");
        } else {
          System.out.print(array[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}

