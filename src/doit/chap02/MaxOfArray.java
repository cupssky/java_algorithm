package doit.chap02;

import java.util.Scanner;

public class MaxOfArray {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int[] array = new int[num];
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }

    System.out.println(maxOf(array));
  }

  static int maxOf(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    return max;
  }
}
