package labs.level3.simple1;

import java.io.IOException;
import java.util.Scanner;

//colorpaper
public class Quiz_12 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[101][101];
    int value = 0;
    int check = 1;
    for (int a = 0; a < n; a++) {
      int i = scanner.nextInt();
      int j = scanner.nextInt();
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      for (int t = i; t < i + x; t++) {
        for (int m = j; m < j + y; m++) {
          array[t][m] = a + 1;
        }
      }
    }

    while (check <= n) {
      for (int i = 0; i < 101; i++) {
        for (int j = 0; j < 101; j++) {
          if (array[i][j] == check) {
            value++;
          }
        }
      }
      System.out.println(value);
      value = 0;
      check++;
    }
  }
}
