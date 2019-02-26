package baekjoon.sorts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    |--------------------------------------------------------------------------
    | Note. 카드
    |--------------------------------------------------------------------------
*/
public class Quiz_11652 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bufferedReader.readLine());
    long[] count = new long[1000000];
    long max = 0;
    long idx = 0;

    while (t-- > 0) {
      int value = Integer.parseInt(bufferedReader.readLine());
      count[value]++;
      max = Math.max(max, count[value]);
    }

    for (int i = 0; i < count.length; i++) {
      if (count[i] == max) {
        idx = i;
      }
    }
    System.out.print(idx);
  }
}
