package labs.course2;

import java.util.Scanner;

public class Quiz_05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Object[][] array = new Object[n][n];
    int x = scanner.nextInt() - 1;
    int y = scanner.nextInt() - 1;
    int r = scanner.nextInt();
    int num = r;
    //x 4 - > i 3 y 5 - > j 4
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        array[i][j] = 0;
      }
    }

    for (int i = 0; i < x; i++) {
      for (int j = y - i; j <= y + 2 * i - 2; j++) {
        array[i][j] = num;
      }
      array[i][y] = num--;
    }
    num = 1;
    for (int i = x + 1; i < x + r + 1; i++) {
      array[i][y] = num++;
    }
    num = r;
    for (int j = y - r; j < y; j++) {
      array[x][j] = num--;
    }
    num = 1;
    for (int j = y + 1; j < y + r + 1; j++) {
      array[x][j] = num++;
    }

    array[x][y] = "*";

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }


  }
}
