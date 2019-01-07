package baekjoon.basic;

import java.util.Scanner;

public class Quiz_11021 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      array[i] = a + b;
    }
    for (int i = 0; i < n; i++) {
      int num = i + 1;
      System.out.println("Case #" + num + ": " + array[i]);
    }
  }
}
