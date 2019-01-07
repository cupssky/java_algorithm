package baekjoon.ifs;

import java.util.Scanner;

public class Quiz_4344 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = 0;
    double[] results = new double[n];

    for (int i = 0; i < n; i++) {

      int valueNum = scanner.nextInt();
      int[] array = new int[valueNum];
      int count = 0;

      for (int j = 0; j < valueNum; j++) {
        array[j] = scanner.nextInt();
        sum += array[j];
      }

      int avg = sum / valueNum;
      sum = 0;

      for (int j = 0; j < valueNum; j++) {
        if (avg < array[j]) {
          count++;
        }
      }

      results[i] = 100 * (double) count / (double) valueNum;

    }
    for (int i = 0; i < n; i++) {
      System.out.println(String.format("%.3f", results[i]) + "%");
    }
  }
}
