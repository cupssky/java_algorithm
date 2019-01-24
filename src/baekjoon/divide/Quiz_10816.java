package baekjoon.divide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Quiz_10816 {

  static int[] result;

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] line = bufferedReader.readLine().split(" ");
    int n = Integer.valueOf(line[0]);
    int[] a = new int[n];

    line = bufferedReader.readLine().split(" ");

    for (int i = 0; i < n; i++) {
      a[i] = Integer.valueOf(line[i]);
    }

    Arrays.sort(a);

    line = bufferedReader.readLine().split(" ");
    int m = Integer.valueOf(line[0]);
    int[] b = new int[m];
    result = new int[m];

    line = bufferedReader.readLine().split(" ");
    for (int i = 0; i < m; i++) {
      b[i] = Integer.valueOf(line[i]);
    }

    for (int i = 0; i < n; i++) {
      System.out.print(search(b, m, a[i]) + " ");
    }
  }

  private static int search(int[] array, int n, int key) {
    int left = 0;
    int right = n - 1;

    while (left < right) {
      int mid = (left + right) / 2;
      if (array[mid] == key) {
        return 1;
      } else if (array[mid] > key) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return 0;
  }
}