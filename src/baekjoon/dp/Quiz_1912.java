package baekjoon.dp;

import java.util.Scanner;

public class Quiz_1912 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int[] d = new int[n];
    for (int i = 0; i < n; i++) {
      d[i] = a[i];
      if (i == 0) {
        continue;
      } else if (d[i] < d[i - 1] + a[i]) {
        d[i] = d[i - 1] + a[i];
      }
    }
    int result = d[0];
    for (int i = 0; i < n; i++) {
      result = Math.max(result, d[i]);
    }
    System.out.println(result);
  }

}
