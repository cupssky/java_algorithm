package baekjoon.sorts;

import java.util.Scanner;

public class Quiz_1937 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] a = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = scanner.nextInt();
      }
    }
    
  }

}
