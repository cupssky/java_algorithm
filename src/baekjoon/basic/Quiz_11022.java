package baekjoon.basic;

import java.util.Scanner;

public class Quiz_11022 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int[] a = new int[t];
    int[] b = new int[t];

    for (int i = 0; i < t; i++) {
      a[i] = scanner.nextInt();
      b[i] = scanner.nextInt();
    }

    for (int i = 0; i < t; i++) {
      int num = i + 1;
      int sum = a[i] + b[i];
      System.out.println("Case #" + num + ": " + a[i] + " + " + b[i] + " = " + sum);
    }
  }
}
