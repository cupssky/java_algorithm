package sw.d1;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 몫과 나머지 출력하기
    |--------------------------------------------------------------------------
*/
public class Quiz_2029 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int num = 1;

    while (t-- > 0) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int v1 = a / b;
      int v2 = a % b;
      System.out.println("#" + num++ + " " + v1 + " " + v2);
    }
  }
}
