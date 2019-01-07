package baekjoon.basic;

import java.util.Scanner;

public class Quiz_10951 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNextInt()) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      System.out.println(a + b);
    }
  }
}
