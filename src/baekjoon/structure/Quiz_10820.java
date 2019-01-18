package baekjoon.structure;

import java.util.Scanner;

public class Quiz_10820 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
      String inputs = scanner.nextLine();
      int upper = 0;
      int lower = 0;
      int blank = 0;
      int number = 0;
      for (int i = 0; i < inputs.length(); i++) {
        int c = inputs.charAt(i);
        if (c >= 'a' && c <= 'z') {
          lower += 1;
        } else if (c >= 'A' && c <= 'Z') {
          upper += 1;
        } else if (c >= '0' && c <= '9') {
          number += 1;
        } else if (c == ' ') {
          blank += 1;
        }
      }
      System.out.println(lower + " " + upper + " " + number + " " + blank);
    }
  }
}
