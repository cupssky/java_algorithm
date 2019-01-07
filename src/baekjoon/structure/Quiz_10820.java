package baekjoon.structure;

import java.util.Scanner;

public class Quiz_10820 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNextLine()) {
      String value = scanner.next();
      int lower = 0;
      int upper = 0;
      int black = 0;
      int num = 0;
      for (int i = 0; i < value.length(); i++) {
        if (value.toCharArray()[i] >= 97 && value.charAt(i) <= 122) {
          lower++;
        } else if (value.toCharArray()[i] >= 65 && value.toCharArray()[i] <= 90) {
          upper++;
        } else if (value.toCharArray()[i] == ' ') {
          black++;
        } else if (value.toCharArray()[i] >= 48 && value.toCharArray()[i] <= 57) {
          num++;
        }
      }
      System.out.println(lower + " " + upper + " " + num + " " + black + " ");
    }

  }
}
