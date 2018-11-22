package labs.course1;

import java.util.Scanner;

public class Quiz_05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int c = scanner.nextInt();
    int r = scanner.nextInt();
    int seat = scanner.nextInt();
    int[][] array = new int[c][r];
    int start = 1;
    int x = 0;
    int y = 0;
    int up, down, left, right = 0;
    int tmp = 0;
    // 0, 0 i가 0일경우는 무조건 상승 i가 마지막 값이면 오른쪽으로  j가 마지막 값이면 아래로 i가 마지막 값이면 왼쪽으로
    for (int i = 0; i < c; i++) {

      for (int j = 0; j < r; j++) {
        array[0][0] = start;
        up = i - j;
        right = c - 1 - j;
        down = r - 1;

        if (up < 0 || up > c) {
          break;
        }
        //i가 0부터 j는 그대로 i는 계속 증가!
        if (up == i) {

        }

        if (right == i) {
        }

        if (down == j) {

        }

      }
    }

    for (int i = 0; i < c; i++) {
      for (int j = 0; j < r; j++) {
        if (array[i][j] == seat) {
          x = i + 1;
          y = j + 1;
        }
      }

    }

    System.out.print(x + " " + y);
  }
}
