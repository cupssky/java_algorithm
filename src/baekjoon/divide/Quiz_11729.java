package baekjoon.divide;

import java.util.Scanner;

public class Quiz_11729 {

  static int count = 0;
  static StringBuilder stringBuilder;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    stringBuilder = new StringBuilder();
    hanoi(k, 1, 3);
    System.out.println(count / 2);
    System.out.println(stringBuilder);
  }

  private static void hanoi(int k, int x, int y) {
    count++;
    if (k == 0) {
      return;
    } else {
      hanoi(k - 1, x, 6 - x - y);
      stringBuilder.append(x + " " + y + "\n");
      hanoi(k - 1, 6 - x - y, y);
    }
  }


}
