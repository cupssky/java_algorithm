package labs.level3.simple1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//영팔이
public class Quiz_06 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] input = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[1]);
    int[][] array = new int[n][m];

    for (int i = 0; i < n; i++) {
      String[] input2 = bufferedReader.readLine().split(" ");
      for (int j = 0; j < m; j++) {
        array[i][j] = Integer.parseInt(input2[j]);
      }
    }
    // 00 01 02
    // 10 11 12
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m / 2; j++) {
        int temp = array[i][j];
        array[i][j] = array[i][m - 1 - j];
        array[i][m - 1 - j] = temp;
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
    bufferedWriter.flush();
  }
}
