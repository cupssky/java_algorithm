package baekjoon.structure;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 알파벳 개수
    |--------------------------------------------------------------------------
*/
public class Quiz_10808 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();
    StringBuilder stringBuilder = new StringBuilder();

    int[] count = new int[26];

    for (char v : value.toCharArray()) {
      count[v - 'a']++;
    }
    for (int n : count) {
      stringBuilder.append(n + " ");
    }
    System.out.print(stringBuilder);
  }
}
