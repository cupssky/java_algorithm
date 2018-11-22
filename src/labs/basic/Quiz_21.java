package labs.basic;

import java.util.Scanner;

public class Quiz_21 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[9];
    int min = 10000000;
    int secondMin = 0;
    int idx = 0;

    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
      if (min > array[i]) {
        secondMin = min;
        min = array[i];
      } else if ((min < array[i] && array[i] < secondMin) || secondMin == min) {
        secondMin = array[i];
      }
    }

    System.out.println(secondMin);

    for (int i = 0; i < array.length; i++) {
      if (array[i] == secondMin) {
        System.out.println(i + 1);
      }
    }
  }
}
