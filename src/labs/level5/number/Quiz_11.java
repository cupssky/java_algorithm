package labs.level5.number;

import java.util.Scanner;

public class Quiz_11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int valueCount = 0;
    boolean flag = false;

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
      flag = true;
      for (int j = 2; j < array[i]; j++) {
        if (array[i] % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        if (array[i] != 1) {
          valueCount++;
        }
      }
    }

    System.out.println(valueCount);
  }
}
