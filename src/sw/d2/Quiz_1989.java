package sw.d2;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 초심자의 회문 검사
    |--------------------------------------------------------------------------
*/
public class Quiz_1989 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int num = 1;

    while (t-- > 0) {
      StringBuilder stringBuilder = new StringBuilder();
      String value = scanner.next();
      String reverse = stringBuilder.append(value).reverse().toString();

      if (value.equals(reverse)) {
        System.out.println("#" + num + " " + 1);
      } else {
        System.out.println("#" + num + " " + 0);
      }
      num++;
    }
  }
}
