package sw.d2;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 아름이의 돌던지기
    |--------------------------------------------------------------------------
*/
public class Quiz_1285 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int num = 1;

    while (t-- > 0) {
      int n = scanner.nextInt();
      int[] count = new int[100001];
      for (int i = 0; i < n; i++) {
        count[Math.abs(scanner.nextInt())]++;
      }

      int value = 0;
      int resultCount = 0;
      for (int i = 1; i <= 100000; i++) {
        if (count[i] != 0) {
          value = i;
          resultCount = count[i];
          break;
        }
      }
      System.out.println("#" + num + " " + value + " " + resultCount);
      num++;
    }
  }
}
