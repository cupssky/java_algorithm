package baekjoon.math;

import java.util.Scanner;

public class Quiz_11005 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int b = scanner.nextInt();

    StringBuilder stringBuilder = new StringBuilder();

    while (n > 0) {
      int r = n % b;
      if (r < 10) {
        stringBuilder.append((char) (r + '0'));
      } else {
        stringBuilder.append((char) (r + 'A' - 10));
      }
      n /= b;
    }
    System.out.print(stringBuilder.reverse());
  }
}
