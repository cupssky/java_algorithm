package labs.course1;

import java.util.Scanner;

public class Record {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int c = scanner.nextInt();
    int r = scanner.nextInt();
    //int k = scanner.nextInt();
    int total = c * r;
    int[][] array = new int[r][c];
    int n = 1;
    // 0 0 0 1 0 2 0 3 0 4 0 5 0 6 0 7
    // 1 0 1 1             1 5 1 6   1 7
    // 2 0                     2 6  2 7
    // 3 0                     3 6    3 7
    // 4 0                     4 6   4 7
    // 5 0 5 1 5 2 5 3 5 4 5 5 5 6 5 7
    // 아래 오른 위 좌
    // 스타트
    //
    // 0 0
    //가로 c -> j  세로 r - > i 7 6
    //
    int indexI = 0;
    int indexJ = 0;

    int i = indexI;
    int j = indexJ;

    int cycle = 0;
    while (n <= total) {
      cycle++;
      for (; i < r - cycle; i++) {
        if (i == r + 1) {
          indexI = i;
        }
//      if (i == r - 1) {
//        break;
//      }
        array[i][j] = n++;
        System.out.println("(" + i + "," + j + ") : " + array[i][j]);
      }
//      System.out.println("test1");
//    for (; j < c; j++) {
//      if (j == c + 1) {
//        indexJ = c + 1;
//      }
//      if (j == c - 1) {
//        break;
//      }
//      array[i][j] = n++;
//      System.out.println("(" + i + "," + j + ") : " + array[i][j]);
//    }
//    System.out.println("test2");
//
//    for (; i > indexI; i--) {
//      array[i][j] = n++;
//      System.out.println("(" + i + "," + j + ") : " + array[i][j]);
//    }
//
//    System.out.println("test3");
//
//    for (; j > indexJ; j--) {
//      array[i][j] = n++;
//      System.out.println("(" + i + "," + j + ") : " + array[i][j]);
//    }
//    System.out.println("test4");
    }

  }

}