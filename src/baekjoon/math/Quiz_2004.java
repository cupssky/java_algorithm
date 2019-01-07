package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_2004 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    long n = Long.parseLong(stringTokenizer.nextToken());
    long m = Long.parseLong(stringTokenizer.nextToken());
    long five = 0;
    long two = 0;

    for (long i = 2; i <= n; i *= 2) {
      two += n / i;
    }

    for (long i = 5; i <= n; i *= 5) {
      five += n / i;
    }

    for (long i = 2; i <= m; i *= 2) {
      two -= m / i;
    }

    for (long i = 5; i <= m; i *= 5) {
      five -= m / i;
    }

    for (long i = 2; i <= n - m; i *= 2) {
      two -= (n - m) / i;
    }

    for (long i = 5; i <= n - m; i *= 5) {
      five -= (n - m) / i;
    }

    System.out.println(Math.min(two, five));
  }
}
