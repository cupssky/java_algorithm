package baekjoon.sorts;

import java.util.Scanner;

public class Quiz_10989 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] temp = new int[10001];

    for (int i = 0; i < n; i++) {
      int value = scanner.nextInt();
      temp[value]++;
    }

    for (int i = 1; i < temp.length; i++) {
      if (temp[i] > 0) {
        for (int j = 0; j < temp[i]; j++) {
          System.out.println(temp[i]);
        }
      }
    }
  }
}
