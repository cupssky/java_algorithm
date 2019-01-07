package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_10872 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    System.out.println(fac(n));
  }

  private static int fac(int n) {
    if (n <= 1) {
      return 1;
    } else {
      return fac(n - 1) * n;
    }
  }
}
