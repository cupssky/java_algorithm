package sw.d1;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 더블더블
    |--------------------------------------------------------------------------
*/
public class Quiz_2019 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int start = 1;

    while (n-- >= 0) {
      System.out.print(start + " ");
      start *= 2;
    }
  }
}
