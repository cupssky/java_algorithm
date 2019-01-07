package doit.chap05;

import java.util.Scanner;

public class Hanoi {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    move(n, 1, 3);
  }

  private static void move(int n, int x, int y) {
    if (n > 1) {
      move(n - 1, x, 6 - x - y);
    }
    System.out.println(n + ": " + x + "에서 " + y + "로");
    if (n > 1) {
      move(n - 1, 6 - x - y, y);
    }
  }
}
