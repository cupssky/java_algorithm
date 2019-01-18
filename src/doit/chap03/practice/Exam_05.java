package doit.chap03.practice;

import java.util.Scanner;

public class Exam_05 {

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
    System.out.print(binSerarchX(array, n, scanner.nextInt()));

  }

  private static int binSerarchX(int[] array, int n, int key) {
    int left = 0;
    int right = n - 1;
    do {
      int center = (left + right) / 2;
      if (array[center] == key) {
        for (int i = center; i > left; i--) {
          if (array[center - 1] < key) {
            break;
          }
        }
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
