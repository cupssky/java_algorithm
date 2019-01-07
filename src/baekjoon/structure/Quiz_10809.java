package baekjoon.structure;

import java.util.Scanner;

public class Quiz_10809 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int[] array = new int[26];

    for (int i = 0; i < s.length(); i++) {
      array[s.charAt(i) - 'a'] = i;
    }

    for (int i : array) {
      System.out.print(i + " ");
    }
  }
}
