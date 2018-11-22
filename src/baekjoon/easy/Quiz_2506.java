package baekjoon.easy;

import java.util.Scanner;

//https://www.acmicpc.net/workbook/view/52
public class Quiz_2506 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int score = 0;
    int allScore = 0;
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
      if (array[i] == 1) {
        score++;
        allScore += score;
      } else {
        score = 0;
      }
    }
    System.out.print(allScore);
  }
}
