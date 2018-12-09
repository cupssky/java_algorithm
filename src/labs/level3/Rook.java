package labs.level3;

import java.io.IOException;

public class Rook {

  public static void main(String[] args) throws IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//    int[][] array = new int[8][8];
//    int idxI = 0;
//    int idxJ = 0;
//    int two = 9;
//    int three = 9;
//    boolean passJ = false, passI = false;
//    for (int i = 0; i < 8; i++) {
//      String[] values = bufferedReader.readLine().split(" ");
//      for (int j = 0; j < 8; j++) {
//        array[i][j] = Integer.parseInt(values[j]);
//        if (array[i][j] == 1) {
//          idxI = i;
//          idxJ = j;
//        }
//        if (array[i][j] == 0) {
//          array[i][j] = 9;
//        }
//      }
//    }
//
//    for (int j = idxJ + 1; j < 8; j++) {
//      if (array[idxI][j] == 3) {
//        three = j;
//      }
//      if (array[idxI][j] == 2) {
//        two = j;
//      }
//    }
//
//    if (two < three) {
//      passJ = false;
//      three = 9;
//      two = 9;
//    } else {
//      passJ = true;
//      three = 9;
//      two = 9;
//    }
//
//    for (int i = idxI + 1; i < 8; i++) {
//      if (array[i][idxJ] == 3) {
//        three = i;
//      }
//      if (array[i][idxJ] == 2) {
//        two = i;
//      }
//    }
//
//    if (two < three) {
//      passI = false;
//    } else {
//      passI = true;
//    }
//
//    if (idxI - 1 < 0) {
//      if (array[idxI + 1][idxJ] == 2 || array[idxI][idxJ - 1] == 2
//          || array[idxI][idxJ + 1] == 2) {
//        passI = false;
//        passJ = false;
//      }
//    }
//    if (idxJ - 1 < 0) {
//      if (array[idxI - 1][idxJ] == 2 || array[idxI + 1][idxJ] == 2 || array[idxI][idxJ + 1] == 2) {
//        passI = false;
//        passJ = false;
//      }
//    }
//    if (idxI + 1 > 8) {
//      if (array[idxI - 1][idxJ] == 2 || array[idxI][idxJ - 1] == 2 || array[idxI][idxJ + 1] == 2) {
//        passI = false;
//        passJ = false;
//      }
//    }
//    if (idxJ + 1 > 8) {
//      if (array[idxI - 1][idxJ] == 2 || array[idxI + 1][idxJ] == 2 || array[idxI][idxJ - 1] == 2) {
//        passI = false;
//        passJ = false;
//      }
//    }
//
//    if (passJ && passI) {
//      System.out.print(0);
//    } else {
//      System.out.print(1);
//    }
//
//    bufferedWriter.flush();
  }
}
