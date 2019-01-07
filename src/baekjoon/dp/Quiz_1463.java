package baekjoon.dp;

import java.util.Scanner;

public class Quiz_1463 {

  private static int COUNT = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    cal(x);
    System.out.println(COUNT);
  }

  private static void cal(int x) {
    if (x == 1) {
      return;
    } else if (x % 3 == 0 && x != 3) {
      COUNT++;
      cal(x / 3);
    } else if (x % 2 == 0 && x != 2) {
      COUNT++;
      cal(x / 2);
    } else {
      COUNT++;
      cal(x - 1);
    }
  }
}
