package labs.course1;

import java.util.Scanner;

public class Quiz_03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] values = new int[n];
    int[] strike = new int[n];
    int[] ball = new int[n];

    for (int i = 0; i < n; i++) {
      values[i] = scanner.nextInt();
      strike[i] = scanner.nextInt();
      ball[i] = scanner.nextInt();
    }

    int result = 0;
    for (int i = 123; i <= 987; i++) {
      if (strikeAndBall(i, values, strike, ball, n)) {
        result++;
      }
    }
    System.out.print(result);

  }

  static boolean strikeAndBall(int i, int[] values, int[] strikes, int[] balls, int n) {
    int hi = i / 100;
    int ti = (i % 100) / 10;
    int oi = (i % 100) % 10;

    if (hi == 0 || ti == 0 || oi == 0) {
      return false;
    }
    if (hi == ti || hi == oi || ti == oi) {
      return false;
    }
    for (int idx = 0; idx < n; idx++) {
      int v = values[idx];
      int strike = 0, ball = 0;
      int hv = v / 100;
      int tv = (v % 100) / 10;
      int ov = (v % 100) % 10;

      if (hi == hv) {
        strike++;
      }
      if (ti == tv) {
        strike++;
      }
      if (oi == ov) {
        strike++;
      }
      if (hi == tv || hi == ov) {
        ball++;
      }
      if (ti == hv || ti == ov) {
        ball++;
      }
      if (oi == hv || oi == tv) {
        ball++;
      }

      if (strike != strikes[idx] || ball != balls[idx]) {
        return false;
      }

    }
    return true;
  }
}

