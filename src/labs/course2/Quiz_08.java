package labs.course2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_08 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] value = bufferedReader.readLine().split(" ");
    String[] point = bufferedReader.readLine().split(" ");

    int n = Integer.parseInt(value[0]);
    int m = Integer.parseInt(value[1]);
    int x = Integer.parseInt(point[0]) - 1;
    int y = Integer.parseInt(point[1]) - 1;

    if (x < 0 || y < 0) {
      x = 0;
      y = 0;
    }
    int count = 0;
    int[][] array = new int[n][m];

    for (int i = 0; i < n; i++) {
      String[] values = bufferedReader.readLine().split(" ");
      for (int j = 0; j < m; j++) {
        array[i][j] = Integer.parseInt(values[j]);
      }
    }

    if (array[x][y] == 1) {
      System.out.print("game over");
    } else {
      int i = x - 1;
      int j = y - 1;
      if (x - 1 < 0) {
        i = x;
      }
      if (x + 1 > n) {
        i = x;
      }
      if (y - 1 < 0) {
        j = y;
      }
      if (y + 1 > m) {
        j = y;
      }

      for (int a = i; a <= x + 1; a++) {
        for (int b = j; b <= y + 1; b++) {
          if (array[a][b] == 1) {
            count++;
          }
        }
      }
      System.out.print(count);

    }
    bufferedWriter.flush();

  }

}
