package labs.level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//직사각형 네개의 합집합 면적 구하기
public class Quiz_05 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    int[][] array = new int[100][100];
    int count = 0;
    for (int i = 0; i < 4; i++) {
      String[] values = bufferedReader.readLine().split(" ");
      int x1 = Integer.parseInt(values[0]);
      int y1 = Integer.parseInt(values[1]);
      int x2 = Integer.parseInt(values[2]);
      int y2 = Integer.parseInt(values[3]);

      // array[y1][x1]
      for (int a = y1; a < y2; a++) {
        for (int b = x1; b < x2; b++) {
          array[a][b] = 1;
        }
      }
    }

    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        if (array[i][j] == 1) {
          count++;
        }
      }
    }

    System.out.println(count);
    bufferedWriter.flush();
  }

}
