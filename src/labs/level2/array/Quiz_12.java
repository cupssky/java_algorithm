package labs.level2.array;

import java.util.Scanner;

//숫자 피라미드
public class Quiz_12 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int s = scanner.nextInt();
    Object[][] array = new Object[n + 1][n * 2];
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i * 2 - 1; j++) {
        array[i][j] = s++;
        if (s == 10) {
          s = 1;
        }
      }
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      if (i % 2 == 0) {
        for (int j = 0; j < i * 2 - 1; j++) {
          System.out.print(array[i][j]);
        }
      } else {
        for (int j = i * 2 - 2; j >= 0; j--) {
          System.out.print(array[i][j]);
        }
      }

      System.out.println();
    }
  }
}
