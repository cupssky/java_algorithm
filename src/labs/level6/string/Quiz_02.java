package labs.level6.string;

import java.util.Scanner;

public class Quiz_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    System.out.print(input.replaceAll(" ", ""));
  }
}
