package labs.level3.simple1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//rook
public class Quiz_10 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    int[][] array = new int[8][8];
    int idxI = 0;
    int idxJ = 0;

    boolean up = true, down = true, right = true, left = true;
    for (int i = 0; i < 8; i++) {
      String[] values = bufferedReader.readLine().split(" ");
      for (int j = 0; j < 8; j++) {
        array[i][j] = Integer.parseInt(values[j]);
        if (array[i][j] == 1) {
          idxI = i;
          idxJ = j;
        }
      }
    }

    //위
    if (idxI >= 1) {
      for (int i = idxI - 1; i >= 0; i--) {
        if (array[i][idxJ] == 2) {
          up = false;
          break;
        } else if (array[i][idxJ] == 3) {
          up = true;
          break;
        } else if (array[i][idxJ] == 0) {
          up = true;
        }
      }
    }
    //아래
    if (idxI < 7) {
      for (int i = idxI + 1; i < 8; i++) {
        if (array[i][idxJ] == 2) {
          down = false;
          break;
        } else if (array[i][idxJ] == 3) {
          down = true;
          break;
        } else if (array[i][idxJ] == 0) {
          down = true;
        }
      }
    }

    if (idxJ < 7) {
      //오른쪽
      for (int j = idxJ + 1; j < 8; j++) {
        if (array[idxI][j] == 2) {
          right = false;
          break;
        } else if (array[idxI][j] == 3) {
          right = true;
          break;
        } else if (array[idxI][j] == 0) {
          right = true;
        }
      }
    }
    if (idxJ >= 1) {
      for (int j = idxJ - 1; j >= 0; j--) {
        if (array[idxI][j] == 2) {
          left = false;
          break;
        } else if (array[idxI][j] == 3) {
          left = true;
          break;
        } else if (array[idxI][j] == 0) {
          left = true;
        }
      }
    }

    if (up && down && left && right) {
      System.out.println(0);
    } else {
      System.out.println(1);
    }
    bufferedWriter.flush();
  }
}
