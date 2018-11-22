package baekjoon;

import java.util.Scanner;

public class Quiz_10797 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[5];
    int count = 0;
    for (int i = 0; i < 5; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < 5; i++) {
      if (array[i] == n) {
        count++;
      }
    }
    System.out.print(count);
  }
}
