package sw.d1;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. N줄 덧셈
    |--------------------------------------------------------------------------
*/
public class Quiz_2025 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    if (n < 10000) {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
        sum += i;
      }
      System.out.print(sum);
    }
  }
}
