package baekjoon.easy;

import java.util.Scanner;
//선택정렬 다시보자..
public class Quiz_2562 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] array = new int[9];
    int turn = 0;

    for (int i = 0; i < 9; i++) {
      array[i] = scanner.nextInt();
    }

    int [] tempArray = array.clone();

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

    for (int i = 0; i < 9; i++) {
      if (tempArray[i] == array[8]) {
        turn = i+1;
      }
    }
    System.out.println(array[8]);
    System.out.println(turn);

  }
}
