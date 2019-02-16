package sw;

import java.util.Scanner;

public class Quiz_2001 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int sum = 0;

    while (t-- > 0) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int[][] a = new int[n][n];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          a[i][j] = scanner.nextInt();
        }
      }
      // 2부터
      int point = m - 2;
      for (int i = point; i <= m; i++) {
        for (int j = point; j <= m; j++) {
          System.out.print(a[i][j] + " ");
          sum += a[i][j];
        }
      }
      System.out.println("test : " + sum);
      sum = 0;
      //System.out.print(29 + 21 + 26 + 21 + 19 + 8 + 9 + 24 + 2);
    }
  }
}
