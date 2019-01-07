package baekjoon.arrays;

import java.util.Scanner;

public class Quiz_10039 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[5];
    int sum = 0;

    for (int i = 0; i < 5; i++) {
      array[i] = scanner.nextInt();
      if (array[i] < 40) {
        array[i] = 40;
      }
      sum += array[i];
    }
    System.out.print(sum / 5);


  }

}
