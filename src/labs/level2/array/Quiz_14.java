package labs.level2.array;

import java.util.Scanner;

//array 2
public class Quiz_14 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int[][] array = new int[a][b];

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        array[i][j] = scanner.nextInt();
      }
    }
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        if (array[i][j] == array[x][y]) {
          System.out.print(array[i][j]);
        }
      }
    }
  }
}
