package baekjoon.divide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_11728 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder();
    String[] number = bufferedReader.readLine().split(" ");
    int n = Integer.valueOf(number[0]);
    int m = Integer.valueOf(number[1]);

    int[] a = new int[n];
    int[] b = new int[m];

    number = bufferedReader.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      a[i] = Integer.valueOf(number[i]);
    }

    number = bufferedReader.readLine().split(" ");
    for (int i = 0; i < m; i++) {
      b[i] = Integer.valueOf(number[i]);
    }

    int[] results = new int[n + m];
    int aIndex = 0;
    int bIndex = 0;
    int arrayIndex = 0;

    while (aIndex < n || bIndex < m) {
      if (bIndex > m || (aIndex < n && a[aIndex] < b[bIndex])) {
        results[arrayIndex++] = a[aIndex++];
      } else {
        results[arrayIndex++] = b[bIndex++];
      }
    }

    for (int i = 0; i < n + m; i++) {
      stringBuilder.append(results[i] + " ");
    }
    System.out.println(stringBuilder);
  }
}
