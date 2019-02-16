package sw.d2;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 파스칼의 삼각형
    |--------------------------------------------------------------------------
*/
public class Quiz_2005 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int number = 1;
    while (t-- > 0) {
      int n = scanner.nextInt();
      int num = 0;
      System.out.print("#");
      System.out.println(number++);
      for (int i = 0; i < n; i++) {
        System.out.print(1 + " ");
        for (int j = 0; j < i; j++) {
          if (i - 1 == j) {
            System.out.print(1 + " ");
          } else {
            System.out.print(num + " ");
          }
        }
        System.out.println();
        num++;
      }
    }
  }

}
