package sw;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 백만장자 프로젝트 X
    |--------------------------------------------------------------------------
*/
public class Quiz_1859 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
      int n = scanner.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = scanner.nextInt();
      }
      // 3 5  9
      int value = 0;
      for (int i = 2; i < n; i += 2) {
        if (i == n - 1) {
          value += a[i] - a[i - 1];
        } else {
          value += a[i] * 2 - (a[i - 1] + a[i - 2]);
        }
      }
      System.out.println(value);

    }
  }
}
