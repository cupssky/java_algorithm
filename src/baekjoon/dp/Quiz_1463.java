package baekjoon.dp;

import java.util.Scanner;

public class Quiz_1463 {

  private static int[] d;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    d = new int[x + 1];
    System.out.println(cal(x));
  }

  private static int cal(int x) {
    if (x == 1) {
      return 0;
    }
    if (d[x] > 0) {
      return d[x];
    }
    d[x] = cal(x - 1) + 1;
    if (x % 3 == 0) {
      int temp = cal(x / 3) + 1;
      if (d[x] > temp) {
        d[x] = temp;
      }
    }
    if (x % 2 == 0) {
      int temp = cal(x / 2) + 1;
      if (d[x] > temp) {
        d[x] = temp;
      }
    }
    return d[x];
  }
}
