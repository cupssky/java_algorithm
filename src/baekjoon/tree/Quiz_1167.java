package baekjoon.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Quiz_1167 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    ArrayList<Edge>[] list = (ArrayList<Edge>[]) new ArrayList[n + 1];

    for (int i = 1; i <= n; i++) {
      list[i] = new ArrayList<>();
    }

    for (int i = 1; i <= n; i++) {
      int x = scanner.nextInt();
      while (true) {
        int y = scanner.nextInt();
        if (y == -1) {
          break;
        }
        int z = scanner.nextInt();
        list[x].add(new Edge(y, z));
      }
    }

    int[] dist = bfs(list, 1, n);
    int start = 1;
    for (int i = 2; i <= n; i++) {
      if (dist[i] > dist[start]) {
        start = i;
      }
    }

    dist = bfs(list, n, start);
    int ans = dist[1];
    for (int i = 2; i <= n; i++) {
      if (ans < dist[i]) {
        ans = dist[i];
      }
    }
    System.out.println(ans);
  }

  private static int[] bfs(ArrayList<Edge>[] list, int start, int n) {
    boolean[] check = new boolean[n + 1];
    int[] dist = new int[n + 1];

    Queue<Integer> queue = new LinkedList<>();

    check[start] = true;
    queue.add(start);

    while (!queue.isEmpty()) {
      int x = queue.remove();
      for (Edge e : list[x]) {
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
}

class Edge {

  public int to;
  public int cost;

  Edge(int to, int cost) {
    this.to = to;
    this.cost = cost;
  }
}