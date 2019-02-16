package sw.d1;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 거꾸로 출력해 보아요
    |--------------------------------------------------------------------------
*/
public class Quiz_1545 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = n; i >= 0; i--) {
      System.out.print(i + " ");
    }
  }
}
