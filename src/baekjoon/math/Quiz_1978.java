package baekjoon.math;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 소수 찾기
    |--------------------------------------------------------------------------
*/
public class Quiz_1978 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int result = 0;
    while (t-- > 0) {
      int v = scanner.nextInt();
      int count = 0;
      for (int i = 1; i <= v; i++) {
        if (v % i == 0) {
          count++;
        }
      }
      if (count == 2) {
        result++;
      }
    }
    System.out.print(result);
  }


}
