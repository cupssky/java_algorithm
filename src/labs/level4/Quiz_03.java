package labs.level4;

import java.util.Scanner;

//좌석배치
public class Quiz_03 {

  static int C;
  static int R;
  static int NUM;
  static int[][] ARRAY;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    C = scanner.nextInt();
    R = scanner.nextInt();
    int k = scanner.nextInt();
    ARRAY = new int[R][C];
    int n = 0;
    NUM = n + 1;
    if (C <= 0 || R <= 0) {
      System.out.print(0);
    } else {
      while (n <= C * R) {
        makeSeat(n);
        n++;
      }
      int x = -1;
      int y = -1;
      for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
          if (ARRAY[i][j] == k) {
            x = i + 1;
            y = j + 1;
            break;
          }
          //System.out.print(ARRAY[i][j] + " ");
        }
      }
      if (x < 0 && y < 0) {
        System.out.print(0);
      } else if (C * R < k) {
        System.out.print(0);
      } else {
        System.out.println(y + " " + x);
      }
    }
  }

  private static void makeSeat(int n) {
    int save;
    if (NUM <= C * R) {
      save = n;
      for (int i = save; i < R - n; i++) {
        ARRAY[i][n] = NUM++;
      }
      save = R - n - 1;
      for (int j = n + 1; j < C - n - 1; j++) {
        ARRAY[save][j] = NUM++;
      }
      save = C - n - 1;
      for (int i = R - n - 1; i >= n + 1; i--) {
        ARRAY[i][save] = NUM++;
      }
      save = n;
      for (int j = C - n - 1; j >= n + 1; j--) {
        ARRAY[save][j] = NUM++;
      }
      //System.out.println(n);
    } else {
      return;
    }
  }
}
