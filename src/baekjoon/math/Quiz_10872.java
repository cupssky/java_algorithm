package baekjoon.math;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 팩토리얼
    |--------------------------------------------------------------------------
*/
public class Quiz_10872 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int value = 1;
    while (n > 1) {
      value *= n;
      n--;
    }
    System.out.print(value);
  }
}
