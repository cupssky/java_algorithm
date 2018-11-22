package doit.chap03;

import java.util.Scanner;

public class BinSearch {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int[] array = new int[num];

    array[0] = scanner.nextInt();

    for (int i = 1; i < array.length; i++) {
      do {
        array[i] = scanner.nextInt();
      } while (array[i] < array[i - 1]);
    }

    System.out.println(binSearch(array, scanner.nextInt(), scanner.nextInt()));
  }

  static int binSearch(int[] array, int num, int key) {
    int left = 0;
    int right = num - 1;

    do {
      int center = (left + right) / 2;
      if (array[center] == key) {
        return center;
      } else if (array[center] < key) {
        left = center + 1;
      } else {
        right = center - 1;
      }
    } while (left <= right);

    return -1;
  }
}
