package sw.d1;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 서랍의 비밀번호 (기본)
    |--------------------------------------------------------------------------
*/
public class Quiz_2043 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int p = scanner.nextInt();
    int k = scanner.nextInt();
    if (p > k) {
      System.out.print(p - k + 1);
    }
  }
}
