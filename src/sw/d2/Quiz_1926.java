package sw.d2;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 간단한 369 게임
    |--------------------------------------------------------------------------
*/
public class Quiz_1926 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      String value = String.valueOf(i);
      int count = 0;
      for (int j = 0; j < value.length(); j++) {
        int num = Integer.parseInt(String.valueOf(value.charAt(j)));
        if (num == 3 || num == 6 || num == 9) {
          count++;
        }
      }
      if (count == 0) {
        System.out.print(i + " ");
      } else {
        for (int a = 0; a < count; a++) {
          System.out.print("-");
        }
        System.out.print(" ");
      }
    }
  }
}
