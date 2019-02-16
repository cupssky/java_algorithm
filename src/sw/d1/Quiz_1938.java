package sw.d1;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 아주 간단한 계산기
    |--------------------------------------------------------------------------
*/
public class Quiz_1938 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);

  }
}
