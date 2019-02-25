package baekjoon.structure;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 네 수
    |--------------------------------------------------------------------------
*/
public class Quiz_10824 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.next();
    String b = scanner.next();
    String c = scanner.next();
    String d = scanner.next();

    long value = Long.parseLong(a + b) + Long.parseLong(c + d);
    System.out.print(value);
  }
}
