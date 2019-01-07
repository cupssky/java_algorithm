package baekjoon.sorts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz_11004 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    int n = Integer.parseInt(stringTokenizer.nextToken());
    int k = Integer.parseInt(stringTokenizer.nextToken()) - 1;
    int[] array = new int[n];

    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    for (int i = 0; i < n; i++) {
      array[i] = Integer.parseInt(stringTokenizer.nextToken());
    }

    Arrays.sort(array);

    System.out.println(array[k]);

  }
}
