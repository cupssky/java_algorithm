package baekjoon.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_2566 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    int [][]array = new int [9][9];
    int max = 0;
    int idxI = 0;
    int idxJ = 0;

    for (int i = 0 ; i < 9; i++) {
      String[] values = bufferedReader.readLine().split(" ");
      for (int j = 0; j < 9; j++) {
        array[i][j] = Integer.parseInt(values[j]);
      }
    }

    for (int i = 0 ; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (max < array[i][j]) {
          max = array[i][j];
          idxI = i+1;
          idxJ = j+1;
        }
      }
    }
    System.out.println(max);
    System.out.println(idxI + " " + idxJ);
    bufferedWriter.flush();
  }
}
