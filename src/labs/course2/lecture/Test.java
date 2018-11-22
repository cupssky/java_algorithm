package labs.course2.lecture;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    mergeSort(array, 0, n - 1);
  }

  static void mergeSort(int[] array, int start, int end) {
    if (start >= end) {
      return;
    } else {
      int mid = (start + end) / 2;

      mergeSort(array, start, mid);
      mergeSort(array, mid + 1, end);
      merge(array, start, mid, mid + 1, end);
    }
  }

  static void merge(int[] array, int start1, int end1, int start2, int end2) {
    int[] temp = new int[100];
    int tempIndex = 0;

    int p, q;
    p = start1;
    q = start2;
    
  }
}
