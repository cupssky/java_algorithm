package labs.basic;

import java.util.Scanner;

public class Quiz_19 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

  }

}
