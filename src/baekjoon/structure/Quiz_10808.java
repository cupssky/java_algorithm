package baekjoon.structure;

import java.util.Scanner;

public class Quiz_10808 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputs = scanner.next();

    int[] array = new int[26];

    for (int i = 0; i < inputs.length(); i++) {
      array[inputs.charAt(i) - 'a']++;
    }

    for (int i : array) {
      System.out.print(i + " ");
    }

  }
}
