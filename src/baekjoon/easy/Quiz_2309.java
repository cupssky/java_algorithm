package baekjoon.easy;

import java.util.Scanner;

public class Quiz_2309 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[9];
    int sum = 0;
    for (int i = 0; i < 9; i++) {
      array[i] = scanner.nextInt();
      sum += array[i];
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (i == j) {
          continue;
        }
        if (sum - array[i] - array[j] == 100) {
          array[i] = 0;
          array[j] = 0;
          break;
        }
      }
    }

    for (int i = 0; i < 9; i++) {
      int idx = i;
      for (int j = i; j < 9; j++) {
        if (array[idx] > array[j]) {
          idx = j;
        }
      }
      int temp = array[i];
      array[i] = array[idx];
      array[idx] = temp;
    }

    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0) {

        System.out.println(array[i]);
      }
    }


  }

}
