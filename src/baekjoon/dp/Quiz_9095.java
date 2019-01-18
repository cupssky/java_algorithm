package baekjoon.dp;

import java.util.Scanner;

public class Quiz_9095 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int[] d = new int[11];
    StringBuilder stringBuilder = new StringBuilder();
    d[1] = 1;
    d[2] = 2;
    d[3] = 4;
    for (int i = 0; i < t; i++) {
      int n = scanner.nextInt();
      for (int j = 4; j <= n; j++) {
        d[j] = d[j - 3] + d[j - 2] + d[j - 1];
      }
      stringBuilder.append(d[n] + "\n");
    }
    System.out.println(stringBuilder);
  }
}
