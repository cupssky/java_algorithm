package baekjoon;

import java.util.Scanner;

public class Quiz_11720 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int sum = 0;
    for (int i = n - 1; i >= 0; i--) {
      array[i] = scanner.nextInt();
      sum += array[i];
    }

    System.out.print(sum);
  }
}
