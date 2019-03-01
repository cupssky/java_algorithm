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
    for (int i = 0; i < value.length(); i++) {
      char v = value.charAt(i);
      if (v >= 'a' && v < 'n' || v >= 'A' && v < 'N') {
        stringBuilder.append((char) (v + 13));
      } else if (v >= 'n' && v <= 'z' || v >= 'N' && v <= 'Z') {
        stringBuilder.append((char) (v - 13));
      } else {
        stringBuilder.append(v);
      }
    }
    System.out.print(stringBuilder);
  }
}
