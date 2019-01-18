package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_9461 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();

    long[] d = {0, 1, 1, 1, 2, 2, 3, 4, 5, 7, 9};
    d = Arrays.copyOf(d, 101);

    for (int i = 10; i < 101; i++) {
      d[i] = d[i - 1] + d[i - 5];
    }

    int t = scanner.nextInt();

    while (t-- > 0) {
      int n = scanner.nextInt();
      stringBuilder.append(d[n] + "\n");
    }
    System.out.print(stringBuilder);
  }
}
