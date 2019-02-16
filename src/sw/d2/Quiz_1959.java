package sw.d2;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 두 개의 숫자열 (브루스포스)
    |--------------------------------------------------------------------------
*/
public class Quiz_1959 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int num = 1;
    while (t-- > 0) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      int[] aArray = new int[a];
      int[] bArray = new int[b];

      for (int i = 0; i < a; i++) {
        aArray[i] = scanner.nextInt();
      }

      for (int i = 0; i < b; i++) {
        bArray[i] = scanner.nextInt();
      }

      if (aArray.length > bArray.length) {
        int[] temp = bArray.clone();
        bArray = aArray.clone();
        aArray = temp.clone();
      }

      int start = 0;
      int sum = 0;
      int max = 0;
      while (start <= bArray.length - aArray.length) {
        int p = start;
        for (int i = 0; i < aArray.length; i++) {
          sum += aArray[i] * bArray[p];
          p++;
        }
        max = Math.max(max, sum);
        start++;
        sum = 0;
      }
      System.out.println("#" + num + " " + max);
      num++;
    }
  }
}
