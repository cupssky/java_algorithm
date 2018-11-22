package labs.basic;

import java.util.Scanner;

public class Quiz_18 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int[] array = new int[k - n + 1];
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = n++;
      if (n > k) {
        break;
      }
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 2; j < array[i]; j++) {
        if (array[i] % j == 0) {
          count++;
          break;
        }
      }
      if (count == 0) {
        if (array[i] != 1) {
          System.out.print(array[i] + " ");
        }
      }
      count = 0;
    }
  }
}
