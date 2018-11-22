package labs.basic;

import java.util.Scanner;

public class Quiz_13 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int count = 0;
    int[] array = new int[1000];
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
        array[count] = i;
      }
    }
    System.out.println(array[k]);

  }
}
