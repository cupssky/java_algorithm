package baekjoon.basic;

import java.util.Scanner;

//다시
public class Quiz_11721 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputs = scanner.nextLine();

    System.out.println(10 % 10);
    for (int i = 0; i < inputs.length(); i++) {
      if (i % 10 == 0) {
        System.out.print(inputs.charAt(i));
      } else if (i % 10 == 9) {
        System.out.print(inputs.charAt(i));
        System.out.println();
      } else {
        System.out.print(inputs.charAt(i));
      }
    }
  }
}
// 0 10 20 30 40 50 60