package doit.chap03.practice;

import java.util.Scanner;

public class Exam_04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    System.out.print(search(a, n, scanner.nextInt()));
  }

  private static int search(int[] a, int n, int key) {
    int left = 0;
    int right = n - 1;
    do {
      int center = (left + right) / 2;
      for (int i = 0; i < n; i++) {
        if (a[i] == a[center]) {
          System.out.print("*");
        } else if (a[i] == a[left]) {
          System.out.print("<-");
        } else if (a[i] == a[right]) {
          System.out.print("->");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
      for (int i = 0; i < n; i++) {
        System.out.print(a[i] + " ");
      }
      System.out.println();
      if (a[center] == key) {
        return center;
      } else if (a[center] < key) {
        left = center + 1;
      } else {
        right = center - 1;
      }

    } while (left <= right);
    return -1;
  }
}
