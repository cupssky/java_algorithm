package baekjoon;

import java.util.Scanner;

public class Quiz_1978 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int count = 0;

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 2; j <= array[i]; j++) {
        if (array[i] % j == 0) {
          count++;
        }
      }
    }

    System.out.print(count);
  }

}
