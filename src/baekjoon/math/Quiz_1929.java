package baekjoon.math;

import java.util.Scanner;

public class Quiz_1929 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    boolean[] prime = new boolean[m + 1];

    prime[0] = true;
    prime[1] = true;
    for (int i = 2; i * i <= m; i++) {
      if (prime[i] == true) {
        continue;
      }
      for (int j = i + i; j <= m; j += i) {
        prime[j] = true;
      }
    }

    for (int i = n; i <= m; i++) {
      if (prime[i] == false) {
        System.out.println(i);
      }
    }
  }
}
