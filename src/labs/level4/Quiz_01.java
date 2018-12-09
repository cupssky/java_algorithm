package labs.level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//bingo
public class Quiz_01 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    int[][] array = new int[5][5];

    for (int i = 0; i < 5; i++) {
      String[] input = bufferedReader.readLine().split(" ");
      for (int j = 0; j < 5; j++) {
        array[i][j] = Integer.parseInt(input[j]);
      }
    }

    for (int i = 0; i < 5; i++) {
      String[] input = bufferedReader.readLine().split(" ");
      for (int j = 0; j < 5; j++) {
        if (checkLine(Integer.parseInt(input[j]), array) >= 3) {
          System.out.println((5 * i) + (j + 1));
          return;
        }
      }
    }
    bufferedWriter.flush();
  }

  static int checkLine(int n, int[][] array) {
    int result = 0;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (array[i][j] == n) {
          array[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < 5; i++) {
      boolean clear = true;
      for (int j = 0; j < 5; j++) {
        if (array[i][j] > 0) {
          clear = false;
        }
      }
      if (clear) {
        result++;
      }
    }

    for (int i = 0; i < 5; i++) {
      boolean clear = true;
      for (int j = 0; j < 5; j++) {
        if (array[j][i] > 0) {
          clear = false;
        }
      }
      if (clear) {
        result++;
      }
    }

    for (int i = 0; i < 1; i++) {
      boolean clear = true;
      for (int j = 0; j < 5; j++) {
        if (array[i][j] > 0) {
          clear = false;
        }
      }
      if (clear) {
        result++;
      }
    }

    // 4 0 3 1 2 2 1 3 0 4
    for (int i = 0; i < 1; i++) {
      boolean clear = true;
      for (int j = 0; j < 5; j++) {
        if (array[4 - j][j] > 0) {
          clear = false;
        }
      }
      if (clear) {
        result++;
      }
    }
    return result;
  }
}
