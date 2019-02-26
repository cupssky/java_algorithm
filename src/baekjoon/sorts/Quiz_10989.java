package baekjoon.sorts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    |--------------------------------------------------------------------------
    | Note. 수정렬하기 3
    |--------------------------------------------------------------------------
*/
public class Quiz_10989 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder();
    int n = Integer.parseInt(bufferedReader.readLine());
    int max = 0;
    int[] count = new int[10001];
    while (n-- > 0) {
      int value = Integer.parseInt(bufferedReader.readLine());
      count[value]++;
      max = Math.max(max, value);
    }
    for (int i = 0; i <= max; i++) {
      if (count[i] != 0) {
        for (int j = 0; j < count[i]; j++) {
          stringBuilder.append(i + "\n");
        }
      }
    }
    System.out.print(stringBuilder);
  }
}
