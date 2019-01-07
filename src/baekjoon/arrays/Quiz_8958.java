package baekjoon.arrays;

import java.util.Scanner;

public class Quiz_8958 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    String[] value = new String[n];

    int count = 0;
    int sum = 0;
    int[] results = new int[n];

    for (int i = 0; i < n; i++) {
      value[i] = scanner.next();
      for (int j = 0; j < value[i].length(); j++) {
        if (value[i].charAt(j) == 'O') {
          count++;
        } else {
          count = 0;
        }
        sum += count;
      }
      results[i] = sum;
      count = 0;
      sum = 0;
    }

    for (int i = 0; i < n; i++) {
      System.out.println(results[i]);
    }
  }
}
