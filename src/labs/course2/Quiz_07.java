package labs.course2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Quiz_07 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[1002][n];

    int[] student = new int[1002];
    int count = 0;
    int idx = 0;
    int max = 0;

    for (int i = 0; i < n; i++) {
      String[] values = bufferedReader.readLine().split(" ");
      for (int j = 0; j < 5; j++) {
        array[i][j] = Integer.parseInt(values[j]);
      }
    }

    array[0][0] = 0;
    student[0] = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 5; j++) {
        for (int k = 0; k < n; k++) {
          if (array[i][j] == array[k][j]) {
            student[k]++;
          }
        }

        for (int k = 0; k < n; k++) {
          System.out.println("test: " + student[k]);
          if (student[k] != 0) {
            count++;
            student[k] = 0;
          }
        }

        if (max < count) {
          max = count;
          count = 0;
          idx = i;
        } else {
          count = 0;
        }
      }
    }
    System.out.println(idx + 1);
    bufferedWriter.flush();
  }
}
