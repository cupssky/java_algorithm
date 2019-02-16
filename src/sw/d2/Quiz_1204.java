package sw.d2;

import java.util.Arrays;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
    |--------------------------------------------------------------------------
*/
public class Quiz_1204 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int num = 1;

    while (t-- > 0) {
      int[] a = new int[1000];
      int[] count = new int[101];

      for (int i = 0; i < 1000; i++) {
        a[i] = scanner.nextInt();
      }
      scanner.nextLine();
      for (int i = 0; i < 1000; i++) {
        count[a[i]]++;
      }

      int max = Arrays.stream(count).max().getAsInt();
      int resultMax = 0;

      for (int i = 0; i < 100; i++) {
        if (count[i] == max) {
          resultMax = Math.max(resultMax, i);
        }
      }
      System.out.println("#" + num + " " + resultMax);
      num++;
    }
  }
}
