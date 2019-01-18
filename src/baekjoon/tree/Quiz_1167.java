package baekjoon.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Quiz_1167 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

  }

  private static int[] bfs(int n, List<Edge>[] a, int start) {
    boolean[] check = new boolean[n + 1];
    int[] dist = new int[n + 1];
    Queue<Integer> queue = new LinkedList<>();
    check[start] = true;
    queue.add(start);

    while (!queue.isEmpty()) {
      int x = queue.remove();
      for (Edge e : a[x]) {
        int y = e.to;
        int cost = e.cost;
        if (check[y] == false) {
          dist[y] = dist[x] + cost;
          queue.add(y);
          check[y] = true;
        }
      }
    }
    return dist;
  }

  class Edge {

    int to;
    int cost;

    public Edge(int to, int cost) {
      this.to = to;
      this.cost = cost;
    }
  }
}
