package baekjoon.star;

import java.util.Scanner;

public class Quiz_2438 {

  //https://www.acmicpc.net/workbook/view/20
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
