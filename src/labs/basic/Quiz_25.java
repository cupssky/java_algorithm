package labs.basic;

import java.util.Scanner;

public class Quiz_25 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[32];
    int i = 0;
    while (n != 1) {
      array[i++] = n % 2;
      n = n / 2;
    }
    array[i] = n;

    for (int j = i; j >= 0; --j) {
      System.out.print(array[j]);
    }
  }

}
