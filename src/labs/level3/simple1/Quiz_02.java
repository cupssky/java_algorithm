package labs.level3.simple1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_02 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    int[][] array = new int[5][5];
    boolean up, down, right, left;
    for (int i = 0; i < 5; i++) {
      String[] values = bufferedReader.readLine().split(" ");
      for (int j = 0; j < 5; j++) {
        array[i][j] = Integer.parseInt(values[j]);
      }
    }

    for (int i = 0; i < 5; i++) {
      up = false;
      down = false;
      left = false;
      right = false;
      for (int j = 0; j < 5; j++) {
        if (i - 1 != 0) {
          if (array[i][j] < array[i - 1][j]) {
            up = true;
          }
        } else {
          up = true;
        }
        if (i + 1 != 4) {
          if (array[i][j] < array[i + 1][j]) {
            down = true;
          }
        } else {
          down = true;
        }
        if (j - 1 != 0) {
          if (array[i][j] < array[i][j - 1]) {
            left = true;
          }
        } else {
          left = true;
        }
        if (j + 1 != 4) {
          if (array[i][j] < array[i][j + 1]) {
            right = true;
          }
        } else {
          right = true;
        }

        if (up && down && left && right) {
          System.out.println("*");
        } else {
          System.out.print(array[i][j] + " ");

        }
      }
      System.out.println();
    }
    bufferedWriter.flush();
  }
}
