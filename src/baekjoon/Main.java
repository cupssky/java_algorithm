package baekjoon;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      a[i] = scanner.nextInt();
    }
    int[] d = new int[n + 1];
    int value = 0;

    System.out.print(value);
  }
}
