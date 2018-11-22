package labs.basic;

import java.util.Scanner;

public class Quiz_11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] array = new int[m - n];
    array[0] = n;
    array[array.length - 1] = m;
    for (int i = 1; i < array.length - 1; i++) {
      array[i] = ++n;
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
      if ((i % 7 == 0) && (i != 0)) {
        System.out.println();
      }
    }
  }

}
