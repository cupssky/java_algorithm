package sw.d2;

import java.util.Arrays;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 스도쿠 검증
    |--------------------------------------------------------------------------
*/
public class Quiz_1974 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    while (t-- > 0) {
      int[][] a = new int[9][9];
      int[] search1 = new int[10];
      int[] search2 = new int[10];
      int[] search3 = new int[10];

      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          a[i][j] = scanner.nextInt();
        }
      }

      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          Arrays.stream(a[i]).distinct();
        }
      }

      for (int i = 0; i < 9; i++) {
        for (int j = 0; i < 3; i++) {
          search1[a[i][j]]++;
        }
        for (int j = 3; i < 6; i++) {
          search2[a[i][j]]++;
        }
        for (int j = 6; i < 9; i++) {
          search3[a[i][j]]++;
        }
      }
    }


  }
}
