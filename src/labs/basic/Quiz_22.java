package labs.basic;

import java.util.Scanner;

public class Quiz_22 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int value = 0;
    int allValue = 0;

    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();

      if (array[i] == 1) {
        value++;
        allValue += value;
      } else {
        value = 0;
      }
    }

    System.out.println(allValue);
  }

}
