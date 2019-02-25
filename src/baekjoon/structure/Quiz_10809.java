package baekjoon.structure;

import java.util.Arrays;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 알파벳 위치
    |--------------------------------------------------------------------------
*/
public class Quiz_10809 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();
    int[] alpha = new int[26];
    Arrays.fill(alpha, -1);
    for (int i = 0; i < value.length(); i++) {
      if (alpha[value.charAt(i) - 'a'] == -1) {
        alpha[value.charAt(i) - 'a'] = i;
      }
    }
    for (int num : alpha) {
      System.out.print(num + " ");
    }
  }
}
