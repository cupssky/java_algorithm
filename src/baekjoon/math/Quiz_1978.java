package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_1978 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    int n = Integer.parseInt(stringTokenizer.nextToken());
    int count = 0;
    stringTokenizer = new StringTokenizer(bufferedReader.readLine());

    for (int i = 0; i < n; i++) {
      if (prime(Integer.parseInt(stringTokenizer.nextToken())) == true) {
        count++;
      }
    }
    System.out.println(count);
  }

  private static boolean prime(int n) {
    if (n == 1) {
      return false;
    } else if (n == 2) {
      return true;
    }
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
