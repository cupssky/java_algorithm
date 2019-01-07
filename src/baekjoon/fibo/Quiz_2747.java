package baekjoon.fibo;

import java.util.Scanner;

public class Quiz_2747 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n + 1];
    array[0] = 0;
    array[1] = 1;
    for (int i = 2; i < n + 1; i++) {
      array[i] = array[i - 1] + array[i - 2];
    }
    System.out.print(array[n]);
  }
}
