package baekjoon.sorts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_10989 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder();
    int n = Integer.parseInt(bufferedReader.readLine());
    int[] check = new int[10001];

    for (int i = 0; i < n; i++) {
      int value = Integer.parseInt(bufferedReader.readLine());
      check[value]++;
    }

    for (int i = 1; i <= 10000; i++) {
      if (check[i] > 0) {
        for (int j = 0; j < check[i]; j++) {
          stringBuilder.append(i + "\n");
        }
      }
    }
    System.out.print(stringBuilder);
  }
}
