package baekjoon.graph;

import java.util.Scanner;

public class Quiz_10451 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
      int n = scanner.nextInt();
      int[] a = new int[n + 1];
      boolean[] c = new boolean[n + 1];
      for (int i = 1; i <= n; i++) {
        a[i] = scanner.nextInt();
        c[i] = false;
      }
      int result = 0;

      for (int i = 1; i <= n; i++) {
        if (c[i] == false) {
          dfs(a, c, i);
          result += 1;
        }
      }
      System.out.println(result);
    }
  }

  private static void dfs(int[] a, boolean[] c, int x) {
    if (c[x]) {
      return;
    }
    c[x] = true;
    dfs(a, c, a[x]);
  }
}
