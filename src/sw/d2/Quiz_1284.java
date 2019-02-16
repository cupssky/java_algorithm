package sw.d2;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 수도 요금 경쟁
    |--------------------------------------------------------------------------
*/
public class Quiz_1284 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int num = 1;
    while (t-- > 0) {
      int p = scanner.nextInt();
      int q = scanner.nextInt();
      int r = scanner.nextInt();
      int s = scanner.nextInt();
      int w = scanner.nextInt();

      int a = p * w;
      int b = 0;
      if (r < w) {
        b = q + (w - r) * s;
      } else {
        b = q;
      }
      System.out.println("#" + num + " " + Math.min(a, b));
      num++;
    }
  }
}
