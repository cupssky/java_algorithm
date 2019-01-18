package baekjoon.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_1707 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    while (t-- > 0) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      ArrayList<Integer>[] arrayList = (ArrayList<Integer>[]) new ArrayList[n + 1];

      for (int i = 1; i <= n; i++) {
        arrayList[i] = new ArrayList<>();
      }

      for (int i = 0; i < m; i++) {
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        arrayList[u].add(v);
        arrayList[v].add(u);
      }

      int[] color = new int[n + 1];
      boolean ok = true;

      for (int i = 1; i <= n; i++) {
        if (color[i] == 0) {
          dfs(arrayList, color, i, 1);
        }
      }

      for (int i = 1; i <= n; i++) {
        for (int j : arrayList[i]) {
          if (color[i] == color[j]) {
            ok = false;
          }
        }
      }

      if (ok) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

  private static void dfs(ArrayList<Integer>[] arrayLists, int[] color, int x, int c) {
    color[x] = c;
    for (int y : arrayLists[x]) {
      if (color[y] == 0) {
        dfs(arrayLists, color, y, 3 - c);
      }
    }
  }
}
