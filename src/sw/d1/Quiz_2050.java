package sw.d1;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 알파벳을 숫자로 변환 (기본)
    |--------------------------------------------------------------------------
*/
public class Quiz_2050 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputs = scanner.next();
    for (int i = 0; i < inputs.length(); i++) {
      System.out.print(inputs.charAt(i) - 'A' + 1 + " ");
    }
  }
}
