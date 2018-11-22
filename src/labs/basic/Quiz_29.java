package labs.basic;

import java.util.Scanner;

public class Quiz_29 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int[][] array = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        array[i][j] = scanner.nextInt();
      }
    }
    int selectX = scanner.nextInt();
    int selectY = scanner.nextInt();

    System.out.print(array[selectX][selectY]);
  }
}
