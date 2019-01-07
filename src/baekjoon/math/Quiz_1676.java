package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_1676 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    int count = 0;
    for (int i = 5; i <= n; i *= 5) {
      count += n / i;
    }
    System.out.println(count);
  }
}
