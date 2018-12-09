package baekjoon.easy;

import java.util.Scanner;

public class Quiz_2476 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int value;
    int maxValue = 0;
    int max = 0;

    for (int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();

      if (a == b && b == c) {
        value = a * 1000 + 10000;
      } else if (a == b || b == c || c == a) {
        value = a * 100 + 1000;
      } else {
        if (maxValue < a) {
          maxValue = a;
          if (maxValue < b) {
            maxValue = b;
            if (maxValue < c) {
              maxValue = c;
            }
          }
        }
        value = maxValue * 100;
      }

      if (max < value) {
        max = value;
      }
    }
    System.out.print(max);
  }
}
