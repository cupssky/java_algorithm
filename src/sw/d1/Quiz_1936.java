package sw.d1;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 1대1 가위바위보
    |--------------------------------------------------------------------------
*/
public class Quiz_1936 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if (a == 1 && b == 3) {
      System.out.print("A");
    } else if (a == 2 && b == 1) {
      System.out.print("A");
    } else if (a == 3 && b == 2) {
      System.out.print("A");
    } else {
      System.out.print("B");
    }
  }
}
