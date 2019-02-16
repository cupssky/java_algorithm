package baekjoon.graph;

import java.util.Scanner;

public class Quiz_2331 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int p = scanner.nextInt();
  }

  private static int leng(int a, int p, int cnt) {

    return leng(a, p, cnt + 1);
  }
}
