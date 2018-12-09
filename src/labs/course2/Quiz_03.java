package labs.course2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_03 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] values = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(values[0]);
    int[][] array = new int[10][10];
    for (int i = 0; i < 10; i++) {
      String[] input = bufferedReader.readLine().split(" ");
      for (int j = 0; j < 10; j++) {
        array[i][j] = Integer.parseInt(input[j]);
      }
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < n; j++) {
        if (array[i][j] == 0) {
          array[i][j] = 1;
        } else {
          array[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 10; j++) {
        if (i == j) {
          continue;
        }
        if (array[i][j] == 0) {
          array[i][j] = 1;
        } else {
          array[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
    bufferedWriter.flush();
  }

}
