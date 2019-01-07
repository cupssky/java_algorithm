package baekjoon.basic;

import java.util.Scanner;

public class Quiz_10952 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextInt()) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      if (a == 0 && b == 0) {
        return;
      } else {
        System.out.println(a + b);
      }
    }
  }
}
