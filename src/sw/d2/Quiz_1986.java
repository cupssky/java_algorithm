package sw.d2;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 지그재그 숫자
    |--------------------------------------------------------------------------
*/
public class Quiz_1986 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int n = 1;
    while (t-- > 0) {
      int num = scanner.nextInt();
      int result = 0;
      for (int i = 1; i <= num; i++) {
        if (i % 2 == 0) {
          result -= i;
        } else {
          result += i;
        }
      }
      System.out.println("#" + n + " " + result);
      n++;
    }
  }
}
