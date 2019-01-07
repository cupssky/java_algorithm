package baekjoon.sorts;

import java.util.Scanner;

public class Quiz_11652 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] temp = new int[100001];
    int max = 0;
    int index = 0;

    for (int i = 1; i < 100001; i++) {
      int value = scanner.nextInt();
      temp[value]++;
    }

    for (int i = 0; i < n; i++) {
      if (temp[i] != 0) {
        if (max < temp[i]) {
          max = temp[i];
          index = i;
        }
      }
    }
    System.out.println(index);
  }
}
