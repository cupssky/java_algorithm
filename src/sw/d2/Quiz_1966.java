package sw.d2;

import java.util.Arrays;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 숫자를 정렬하자
    |--------------------------------------------------------------------------
*/
public class Quiz_1966 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int n = 1;
    while (t-- > 0) {
      int num = scanner.nextInt();
      int[] a = new int[num];

      for (int i = 0; i < num; i++) {
        a[i] = scanner.nextInt();
      }
      Arrays.sort(a);
      System.out.print("#" + n + " ");
      for (int i = 0; i < num; i++) {
        System.out.print(a[i] + " ");
      }
      System.out.println();
      n++;
    }
  }
}
