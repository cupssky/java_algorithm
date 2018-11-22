package doit.chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    int[] array = new int[num];

    for (int i = 0; i < array.length; i++) {
      array[i] = 100 + random.nextInt(90);
      System.out.println(array[i]);
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
