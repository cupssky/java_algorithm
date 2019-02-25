package baekjoon.structure;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. ROT13
    |--------------------------------------------------------------------------
*/
public class Quiz_11655 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();
    StringBuilder stringBuilder = new StringBuilder();

    for (char v : value.toCharArray()) {
      if ((v >= 'a' && v <= 'm') || (v >= 'A' && v <= 'M')) {
        stringBuilder.append((char) (v + 13));
      } else if (v == ' ') {
        stringBuilder.append(' ');
      } else {
        stringBuilder.append((char) (v - 13));
      }
    }
    System.out.print(stringBuilder);
  }
}
