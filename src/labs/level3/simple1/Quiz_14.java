package labs.level3.simple1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//class president
public class Quiz_14 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] inputN = bufferedReader.readLine().split(" ");

    int n = Integer.parseInt(inputN[0]);
    int[][] array = new int[n][5];
    int confirmJ = 0;
    int confirmK = 0;

    for (int i = 0; i < n; i++) {
      String[] inputMate = bufferedReader.readLine().split(" ");
      for (int j = 0; j < 5; j++) {
        array[i][j] = Integer.parseInt(inputMate[j]);
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 5; j++) {
        for (int k = 1; k < 5; k++) {

        }

      }
    }
    bufferedWriter.flush();
  }
}
