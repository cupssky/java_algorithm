package labs.level8;

import java.util.Scanner;

//division
public class Quiz_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    calc(n);
  }

  static void calc(int n) {
    if (n > 0) {
      calc(n - 1);
    }

  }
}
