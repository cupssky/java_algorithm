package baekjoon.binomal;

import java.util.Scanner;

public class Quiz_11050 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    System.out.println(fac(n) / (fac(n - k) * fac(k)));
  }

  private static int fac(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return fac(n - 1) * n;
    }
  }
}
