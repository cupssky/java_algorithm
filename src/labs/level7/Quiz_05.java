package labs.level7;

import java.util.Scanner;

public class Quiz_05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    practal(n);
  }

  static void practal(int n) {
    if (n - 1 > 0) {
      practal(n - 1);
    }
    System.out.print(n + " ");
    if (n - 1 > 0) {
      practal(n - 1);
    }
  }
}
