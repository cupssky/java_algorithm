package baekjoon.math;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 팩토리얼 0의 개수
    |--------------------------------------------------------------------------
*/
public class Quiz_1676 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int two = 0;
    int five = 0;
    for (int i = 1; i <= n; i++) {
      int temp = i;
      while (temp % 5 == 0 || temp % 2 == 0) {
        if (temp % 5 == 0) {
          temp /= 5;
          five++;
        }
        if (temp % 2 == 0) {
          temp /= 2;
          two++;
        }
      }
    }
    System.out.print(two > five ? five : two);
  }


}
