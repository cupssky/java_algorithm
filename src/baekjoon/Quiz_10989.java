package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_10989 {

  public static void run() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int n = Integer.parseInt(br.readLine());
      int[] array = new int[10001];

      for (int i = 0; i < n; i++) {
        array[Integer.parseInt(br.readLine())]++;
      }

      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      for (int i = 1; i < 10000; i++) {
        if (array[i] > 0) {
          for (int j = 0; j < array[i]; j++) {
            bw.write(Integer.toString(i) + "\n");
          }
        }
      }
      br.close();
      bw.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
