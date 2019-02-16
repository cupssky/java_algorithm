package doit.chap06;

import java.util.Scanner;

public class Sort {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    sort(a, 0, n - 1);

    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }

  private static void sort(int[] a, int left, int right) {
    int pl = left;
    int pr = right;
    int piv = a[(left + right) / 2];
    do {
      while (a[pl] < piv) {
        pl++;
      }

      while (a[pr] > piv) {
        pr--;
      }
      if (pl <= pr) {
        int tmp = a[pl];
        a[pl] = a[pr];
        a[pr] = tmp;
        pl++;
        pr--;
      }
    } while (pl <= pr);

    if (left < pr) {
      sort(a, left, pr);
    }
    if (right > pl) {
      sort(a, pl, right);
    }
  }
}
