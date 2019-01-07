package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_11005 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    int n = Integer.parseInt(stringTokenizer.nextToken());
    int b = Integer.parseInt(stringTokenizer.nextToken());

    while (n > 0) {
      int r = n % b;

      n = n / b;
    }
  }
}
