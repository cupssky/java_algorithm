package doit.chap06;

import java.util.Scanner;

public class Quick {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }

    quicks(a, 0, n - 1);

    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }

  private static void quicks(int[] a, int left, int right) {
    int pl = left;
    int pr = right;
    int pivot = a[(left + right) / 2];

    do {
      while (a[pl] < pivot) {
        pl++;
      }
      while (a[pr] > pivot) {
        pr--;
      }
      if (pl <= pr) {
        int temp = a[pl];
        a[pl] = a[pr];
        a[pr] = temp;
        pl++;
        pr--;
      }
    } while (pl <= pr);
    if (left < pr) {
      quicks(a, left, pr);
    }
    if (pl < right) {
      quicks(a, pl, right);
    }
  }
}
