package sw.d2;

import java.util.Arrays;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 중간 평균값 구하기
    |--------------------------------------------------------------------------
*/
public class Quiz_1984 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int n = 1;

    while (t-- > 0) {
      int[] a = new int[10];
      for (int i = 0; i < 10; i++) {
        a[i] = scanner.nextInt();
      }
      int max = Arrays.stream(a).max().getAsInt();
      int min = Arrays.stream(a).min().getAsInt();
      System.out.println("#" + n + " " + Math.round(
          Arrays.stream(a).filter(value -> value != max && value != min).average().getAsDouble()));
      n++;
    }
  }
}
