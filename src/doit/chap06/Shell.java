package doit.chap06;

import java.util.Scanner;

public class Shell {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }

    for (int h = n / 2; h > 0; h /= 2) {
      for (int i = h; i < n; i++) {
        int j;
        int tmp = a[i];
        for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
          a[j + h] = a[j];
        }
        a[j + h] = tmp;
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }
}
