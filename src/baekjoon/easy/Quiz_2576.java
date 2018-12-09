package baekjoon.easy;

import java.util.Scanner;

public class Quiz_2576 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[7];
    int min = 100;
    int sum = 0;
    for (int i = 0;  i < 7; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < 7; i++) {
      if (array[i] % 2 != 0) {
          sum += array[i];
        if (min > array[i]) {
          min = array[i];
        }
      }
    }

    if(sum > 0) {
      System.out.println(sum);
      System.out.println(min);
    } else {
      System.out.println(-1);
    }

  }

}
