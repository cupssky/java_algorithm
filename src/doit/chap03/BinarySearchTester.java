package doit.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    array[0] = scanner.nextInt();
    for (int i = 1; i < n; i++) {
      do {
        array[i] = scanner.nextInt();
      } while (array[i - 1] > array[i]);
    }

    int key = scanner.nextInt();
    int search = Arrays.binarySearch(array, key);
    System.out.print(search + " " + key);
  }
}
