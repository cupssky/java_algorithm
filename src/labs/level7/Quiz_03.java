package labs.level7;

import java.util.Scanner;

public class Quiz_03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    mountain(n);
  }

  static void mountain(int n) {
    if (n - 1 > 0) {
      mountain(n - 1);
    }
    System.out.print(n);
    if (n - 1 > 0) {
      mountain(n - 1);
    }
  }
}
