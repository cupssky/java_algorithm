package doit.chap02;

import java.util.Scanner;

public class ReverseArray {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int[] array = new int[num];

    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }

    reverse(array);

    for (int i = 0; i < array.length; i++) {

      System.out.println(array[i]);
    }
  }

  static void swap(int[] array, int idx1, int idx2) {
    int temp = array[idx1];
    array[idx1] = array[idx2];
    array[idx2] = temp;
  }

  static void reverse(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      swap(array, i, array.length - i - 1);
    }
  }
}
