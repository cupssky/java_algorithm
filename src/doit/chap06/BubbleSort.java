package doit.chap06;

import java.util.Scanner;

public class BubbleSort {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int[] array = new int[num];

    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }

    bubbleSort(array, num);
    System.out.println("정렬완료");

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  static void swap(int[] a, int idx1, int idx2) {
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }

  static void bubbleSort(int[] a, int n) {
    for (int i = 0; i < n - 1; i++) {
      for (int j = n - 1; j > i; j--) {
        if (a[j - 1] > a[j]) {
          swap(a, j - 1, j);
        }
      }
    }
  }
}
