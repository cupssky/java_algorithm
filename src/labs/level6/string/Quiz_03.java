package labs.level6.string;

import java.util.Scanner;

public class Quiz_03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    char[] array = input.toCharArray();

    for (int i = array.length - 1; i >= 0; i--) {
      System.out.print(array[i]);
    }
  }
}