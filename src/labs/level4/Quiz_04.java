package labs.level4;

import java.util.Scanner;

//야구 게임
public class Quiz_04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] value = new int[n];
    int[] strikes = new int[n];
    int[] balls = new int[n];

    for (int i = 0; i < n; i++) {
      value[i] = scanner.nextInt();
      strikes[i] = scanner.nextInt();
      balls[i] = scanner.nextInt();
    }
    int result = 0;
    for (int i = 123; i <= 987; i++) {
      if (gameResult(i, n, value, strikes, balls)) {
        result++;
      }
    }
    System.out.print(result);
  }

  private static boolean gameResult(int opponentValue, int n, int[] value, int[] strikes,
      int[] balls) {
    int start = (opponentValue % 100) % 10;
    int mid = (opponentValue % 100) / 10;
    int end = opponentValue / 100;

    if (start == 0 || mid == 0 || end == 0) {
      return false;
    }
    if (start == mid || mid == end || start == end) {
      return false;
    }

    for (int i = 0; i < n; i++) {
      int confirmStart = (value[i] % 100) % 10;
      int confirmMid = (value[i] % 100) / 10;
      int confirmEnd = value[i] / 100;

      int strike = 0;
      int ball = 0;

      if (start == confirmStart) {
        strike++;
      }

      if (mid == confirmMid) {
        strike++;
      }

      if (end == confirmEnd) {
        strike++;
      }

      if (start == confirmMid || start == confirmEnd) {
        ball++;
      }

      if (mid == confirmEnd || mid == confirmStart) {
        ball++;
      }

      if (end == confirmMid || end == confirmStart) {
        ball++;
      }

      if (strike != strikes[i] || ball != balls[i]) {
        return false;
      }
    }
    return true;
  }
}