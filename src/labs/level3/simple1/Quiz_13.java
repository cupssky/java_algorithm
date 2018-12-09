package labs.level3.simple1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//mine
public class Quiz_13 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] input = bufferedReader.readLine().split(" ");
    String[] input2 = bufferedReader.readLine().split(" ");

    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[1]);
    int x = Integer.parseInt(input2[0]) - 1;
    int y = Integer.parseInt(input2[1]) - 1;

    if (x < 0 || y < 0) {
      x = 0;
      y = 0;
    }

    int count = 0;
    int[][] array = new int[n][m];

    for (int i = 0; i < n; i++) {
      String[] input3 = bufferedReader.readLine().split(" ");
      for (int j = 0; j < m; j++) {
        array[i][j] = Integer.parseInt(input3[j]);
      }
    }

    if (array[x][y] == 1) {
      System.out.println("game over");
    } else {
      int minI = x - 1;
      int maxI = x + 1;
      int minJ = y - 1;
      int maxJ = y + 1;
      if (minI < 0) {
        minI = x;
      }
      if (maxI > x + 1) {
        maxI = x;
      }
      if (minJ < 0) {
        minJ = y;
      }
      if (maxJ > y + 1) {
        maxJ = y;
      }

      for (int i = minI; i <= maxI; i++) {
        for (int j = minJ; j <= maxJ; j++) {
          if (array[i][j] == 1) {
            count++;
          }
        }
      }
      System.out.println(count);
    }
    bufferedWriter.flush();
  }
}
