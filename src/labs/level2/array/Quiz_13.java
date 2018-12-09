package labs.level2.array;

import java.util.Scanner;

//array1
public class Quiz_13 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int[][] array = new int[a][b];
    int num = 1;
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        array[i][j] = num++;
      }
    }
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
