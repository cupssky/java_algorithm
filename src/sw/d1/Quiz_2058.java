package sw.d1;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 자릿수 더하기 (기본)
    |--------------------------------------------------------------------------
*/
public class Quiz_2058 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String value = String.valueOf(n);
    int sum = 0;

    for (int i = 0; i < value.length(); i++) {
      sum += Integer.parseInt(String.valueOf(value.charAt(i)));
    }
    System.out.print(sum);
  }
}
