package baekjoon.sorts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_11004 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] value = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(value[0]);
    int k = Integer.parseInt(value[1]);

    int[] a = new int[n];
    String[] num = bufferedReader.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      a[i] = Integer.valueOf(num[i]);
    }
    System.out.print(a[k - 1]);
  }


}
