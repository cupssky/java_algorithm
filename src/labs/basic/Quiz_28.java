package labs.basic;

import java.util.Scanner;

public class Quiz_28 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int[] array = new int[n * m];

    for (int i = 1; i <= array.length; i++) {
      System.out.print(i + " ");
      if (i % m == 0) {
        System.out.println();
      }
    }
  }
}