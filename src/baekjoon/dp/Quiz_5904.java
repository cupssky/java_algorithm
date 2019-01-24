package baekjoon.dp;

import java.util.Scanner;

public class Quiz_5904 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    String[] moo = new String[n + 1];
    String[] value;

    moo[0] = "m o o";
    moo[1] = "m o o m o o o m o o";

    if (n < 2) {
      value = moo[n].split(" ");
    } else {
      moo[2] = "m o o m o o o m o o m o o o o m o o m o o o m o o";

      for (int i = 2; i <= n; i++) {
        moo[i] = moo[i - 2] + " o o " + moo[i - 1];
      }

      value = moo[n].split(" ");
    }
    System.out.println(value[n - 1]);
  }
}
