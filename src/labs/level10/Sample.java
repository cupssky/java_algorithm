package labs.level10;

import java.util.Scanner;

public class Sample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }
  }

  private static int binarySearch(int[] array, int start, int end, int value) {
    if (start > end) {
      return -1;
    } else if (start == end) {
      if (array[start] == value) {
        return start;
      } else {
        return -1;
      }
    } else {
      int mid = (start + end) / 2;
      if (array[mid] == value) {
        return mid;
      } else if (array[mid] > value) {
        return binarySearch(array, start, mid - 1, value);
      } else {
        return binarySearch(array, mid, end, value);
      }
    }
  }
}
