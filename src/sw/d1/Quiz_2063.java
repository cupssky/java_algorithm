package sw.d1;

import java.util.Arrays;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 중간값 구하기 (기본)
    |--------------------------------------------------------------------------
*/
public class Quiz_2063 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }
    Arrays.sort(array);
    System.out.print(array[n / 2]);
  }
}
