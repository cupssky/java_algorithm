package labs.level4;

import java.util.Scanner;

public class Test {

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int arr_seat[][];
    int col, row, target;
    int i = 0, num = 1;
    int x, y;
    int t = 1;

    col = scan.nextInt();
    row = scan.nextInt();
    target = scan.nextInt();

    arr_seat = new int[col][row];
    x = 0;
    y = -1;
    while (0 <= col || 0 <= row) {
      //열
      for (i = 0; i < row; i++) {
        y = y + t;
        arr_seat[x][y] = num;
        if (num == target) {
          System.out.print((x + 1));
          System.out.println(" " + (y + 1));
          return;
        }
        num++;
      }

      col--;
      //행
      for (i = 0; i < col; i++) {
        x = x + t;
        arr_seat[x][y] = num;
        if (num == target) {
          System.out.print((x + 1));
          System.out.println(" " + (y + 1));
          return;
        }
        num++;
      }

      row--;

      t = t * -1;
    }
    System.out.println("0");
  }
}