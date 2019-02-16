package doit.chap06;

import java.util.Scanner;

public class Insert {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }

    for (int i = 1; i < n; i++) {
      int temp = a[i];
      int j;
      for (j = i; j > 0 && a[j - 1] > temp; j--) {
        a[j] = a[j - 1];
      }
      a[j] = temp;
    }
    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }
}
