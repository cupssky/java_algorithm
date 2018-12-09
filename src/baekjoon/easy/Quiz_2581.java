package baekjoon.easy;

import java.util.Scanner;

public class Quiz_2581 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    int n = scanner.nextInt();

    int[] array = new int[n - m + 1];
    int sum = 0;
    int min = n;
    boolean flag;
    
    for (int i = 0; i < array.length; i++) {
      array[i] = m++;
    }

    for (int i = 0; i < array.length; i++) {
      flag = true;
      for (int j = 2; j < array[i]; j++) {
        if (array[i] % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        if (min > array[i]) {
          min = array[i];
        }
        sum += array[i];
      }
    }

    if (sum == 0) {
      System.out.println(-1);
    } else {
      System.out.println(min);
      System.out.println(sum);
    }
  }
}
