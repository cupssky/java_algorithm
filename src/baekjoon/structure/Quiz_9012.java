package baekjoon.structure;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 괄호
    |--------------------------------------------------------------------------
*/
public class Quiz_9012 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
      String value = scanner.next();
      int count = 0;
      for (char v : value.toCharArray()) {
        if (v == '(') {
          count++;
        } else if (v == ')') {
          count--;
        }
        if (count < 0) {
          break;
        }
      }
      if (count == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

}
