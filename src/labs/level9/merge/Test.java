package labs.level9.merge;

import java.util.Scanner;

public class Test {

  public static int[] sorted;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] array = new int[n];
    sorted = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    mergeSort(array, 0, n - 1);

    for (int i = 0; i < n; i++) {
      System.out.print(sorted[i] + " ");
    }
  }

  public static void mergeSort(int[] array, int start, int end) {

    if (start < end) {
      int middle = (start + end) / 2;
      mergeSort(array, start, middle);
      mergeSort(array, middle + 1, end);
      merge(array, start, middle, end);
    }
  }

  public static void merge(int[] array, int start, int middle, int end) {

    int s = start;
    int m = middle + 1;
    int e = start;

    while (s <= middle && m <= end) {
      if (array[s] <= array[m]) {
        sorted[e++] = array[s++];
      } else {
        sorted[e++] = array[m++];
      }
    }

    if (s > middle) {
      for (int a = m; a <= end; a++) {
        sorted[e++] = array[a];
      }
    } else {
      for (int a = s; a <= middle; a++) {
        sorted[e++] = array[a];
      }
    }

    for (int a = start; a <= end; a++) {
      array[a] = sorted[a];
    }
  }
}
