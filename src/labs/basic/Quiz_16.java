package labs.basic;

import java.util.Scanner;

public class Quiz_16 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i <= n; i++) {
      for (int b = 0; b < n - i; b++) {
        System.out.print(" ");
      }

      for (int b = 0; b < 2 * i - 1; b++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
