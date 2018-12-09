package baekjoon.easy;

import java.util.Scanner;

public class Quiz_2490 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] array = new int[3][4];
    int count = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        array[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        if (array[i][j] == 0) {
          count++;
        }
      }
      switch (count) {
        case 1:
          System.out.println("A");
          break;
        case 2:
          System.out.println("B");
          break;
        case 3:
          System.out.println("C");
          break;
        case 4:
          System.out.println("D");
          break;
        case 0:
          System.out.println("E");
          break;
      }
      count = 0;
    }
  }
}
