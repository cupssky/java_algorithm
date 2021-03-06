package baekjoon.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. DFS와 BFS
    |--------------------------------------------------------------------------
*/
public class Quiz_1260 {

  static ArrayList<Integer>[] a;
  static boolean[] c;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int v = scanner.nextInt();

    a = new ArrayList[n + 1];

    for (int i = 1; i <= n; i++) {
      a[i] = new ArrayList<>();
    }
    for (int i = 0; i < m; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      a[x].add(y);
      a[y].add(x);
    }

    for (int i = 1; i <= n; i++) {
      Collections.sort(a[i]);
    }

    c = new boolean[n + 1];
    dfs(v);
    System.out.println();
    c = new boolean[n + 1];
    bfs(v);

  }

  private static void dfs(int start) {
    if (c[start]) {
      return;
    }
    c[start] = true;
    System.out.print(start + " ");
    for (int value : a[start]) {
      if (c[value] == false) {
        dfs(value);
      }
    }
  }

  private static void bfs(int start) {
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(start);
    c[start] = true;
    while (!queue.isEmpty()) {
      int x = queue.poll();
      System.out.print(x + " ");
      for (int value : a[x]) {
        if (c[value] == false) {
          queue.offer(value);
          c[value] = true;
        }
      }
    }
  }

}
