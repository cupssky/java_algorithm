package labs.level5.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//sequencesum
public class Quiz_05 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(bufferedReader.readLine());
    int[][] array = new int[n + 1][n + 1];
    int[] result = new int[n + 1];

    for (int i = 0; i < n; i++) {
      String[] input = bufferedReader.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        array[i][j] = Integer.parseInt(input[j]);
      }
    }

    if (n == 2) {
      System.out.println("1 1");
    } else {
      result[0] = ((array[0][1] + array[1][2] + array[0][2]) / 2) - array[1][2];
      for (int i = 1; i <= n; i++) {
        result[i] = array[i - 1][i] - result[i - 1];
      }
      for (int i = 0; i < result.length - 1; i++) {
        System.out.print(result[i] + " ");
      }
    }
    bufferedWriter.flush();
  }

}
