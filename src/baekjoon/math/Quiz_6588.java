package baekjoon.math;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_6588 {

  public static final int MAX = 100000;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> prime = new ArrayList<>();

    boolean[] check = new boolean[MAX + 1];
    check[0] = true;
    check[1] = true;

    for (int i = 2; i * i <= MAX; i++) {
      if (check[i] == true) {
        continue;
      }
      prime.add(i);
      for (int j = i + i; j <= MAX; j += i) {
        check[j] = true;
      }
    }

    while (true) {
      int n = scanner.nextInt();
      if (n < 1) {
        break;
      }

      for (int i = 0; i < prime.size(); i++) {
        int p = prime.get(i);
        if (check[n - p] == false) {
          System.out.println(n + " = " + p + " + " + (n - p));
          break;
        }
      }
    }
  }
}
