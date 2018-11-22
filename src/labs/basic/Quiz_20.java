package labs.basic;

import java.util.Scanner;

public class Quiz_20 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[9];
    int max = 0;
    int idx = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
      if (max < array[i]) {
        max = array[i];
        idx = i + 1;
      }
    }
    System.out.println(max);
    System.out.println(idx);
  }
}
