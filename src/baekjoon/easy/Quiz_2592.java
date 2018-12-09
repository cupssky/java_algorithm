package baekjoon.easy;

import java.util.Scanner;

public class Quiz_2592 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[10];
    int[] counts = new int[1000];
    int sum = 0;
    int max = 0;
    int value = 0;

    for (int i = 0; i < 10; i++) {
      array[i] = scanner.nextInt();
      sum += array[i];
    }

    for (int i = 0; i < 10; i++) {
      counts[array[i]]++;
      if (max < counts[array[i]]) {
        max = counts[array[i]];
        value = array[i];
      }
    }

    System.out.println(sum / 10);
    System.out.print(value);
  }

}
