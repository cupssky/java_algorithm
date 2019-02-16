package baekjoon.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_11724 {

  static ArrayList<Integer>[] a;
  static boolean[] c;
  static int count = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    a = (ArrayList<Integer>[]) new ArrayList[n + 1];

    for (int i = 1; i <= n; i++) {
      a[i] = new ArrayList<>();
    }

    for (int i = 0; i < m; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      a[x].add(y);
      a[y].add(x);
    }

    c = new boolean[n + 1];

    for (int i = 0; i < n; i++) {
      dfs(i);
    }

    System.out.print(count);
  }

  private static void dfs(int start) {
    if (c[start]) {
      return;
    }
    c[start] = true;
    for (int y : a[start]) {
      if (c[y] == false) {
        dfs(y);
        count++;
      }
    }
  }
}

