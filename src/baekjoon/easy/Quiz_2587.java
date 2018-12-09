package baekjoon.easy;

import java.util.Scanner;

public class Quiz_2587 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[5];
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      array[i] = scanner.nextInt();
      sum += array[i];
    }

    for (int i = 0; i < 5; i++) {
      int idx = i;
      for (int j = i; j < 5; j++) {
        if (array[idx] > array[j]) {
          idx = j;
        }
      }
      int temp = array[i];
      array[i] = array[idx];
      array[idx] = temp;
    }
    System.out.println(sum / 5);
    System.out.print(array[5 / 2]);
  }
}