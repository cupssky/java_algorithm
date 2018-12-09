package labs.level3.simple1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//attack range
public class Quiz_11 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] cols = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(cols[0]);

    Object[][] array = new Object[n][n];
    String[] value = bufferedReader.readLine().split(" ");

    int x = Integer.parseInt(value[0]) - 1;
    int y = Integer.parseInt(value[1]) - 1;
    int range = Integer.parseInt(value[2]);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == x && j == y) {
          array[x][y] = "x";
        } else {
          array[i][j] = 0;
        }
      }
    }

    int startI = x - range;
    int endI = x + range;
    int startJ = y - range;
    int endJ = y + range;

    if (startI < 0) {
      startI = 0;
    }
    if (endI > n) {
      endI = n - 1;
    }
    if (startJ < 0) {
      startJ = 0;
    }
    if (endJ > n) {
      endJ = n - 1;
    }

    //x 3 y 4
    for (int i = startI; i <= endI; i++) {
      for (int j = startJ; j <= endJ; j++) {
        if (array[i][j] != array[x][y]) {
          int value1 = Math.abs(x - i);
          int value2 = Math.abs(y - j);
          int result = Math.abs(value1 + value2);
          if (result <= range) {
            array[i][j] = result;
          }
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

    bufferedWriter.flush();
  }
}
