package labs.course2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_04 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    int[][] array = new int[8][8];
    int kingI = 0;
    int kingJ = 0;
    int idxI = 0;
    int idxJ = 0;
    int rookCount = 0;
    int otherCount = 0;

    for (int i = 0; i < 8; i++) {
      String[] values = bufferedReader.readLine().split(" ");
      for (int j = 0; j < 8; j++) {
        array[i][j] = Integer.parseInt(values[j]);
      }
    }

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (array[i][j] == 1) {
          kingI = i;
          kingJ = j;
          break;
        }
      }
    }
    System.out.println(kingI + " " + kingJ);

    idxI = kingI - 1;
    idxJ = kingJ - 1;
    System.out.println(idxI + " " + idxJ);

    if (idxI < 0) {
      idxI = kingI;
    }

    if (idxJ < 0) {
      idxJ = kingJ;
    }

    int one = 9;
    int two = 9;
    int three = 9;
    int flagI = 0;
    int flagJ = 0;
    for (int j = kingJ; j < 8; j++) {
      if (array[kingI][j] == 2) {
        two = j;
      } else if (array[kingI][j] == 3) {
        three = j;
      }
    }

    if (kingJ < two && two < three) {
      if (array[kingI][idxJ] != 2) {
        flagJ++;
      }
    }

    two = 9;
    three = 9;

    for (int i = kingI; i < 8; i++) {
      if (array[i][kingJ] == 2) {
        two = i;
      } else if (array[i][kingJ] == 3) {
        three = i;
      }
    }

    if (two == 9) {
      flagI = 0;
    } else {
      if (kingI < two && two < three) {
        if (array[idxI][kingJ] != 2) {
          flagI++;
        }
      }
    }

    if (flagI == flagJ) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
    bufferedWriter.flush();
  }
}
