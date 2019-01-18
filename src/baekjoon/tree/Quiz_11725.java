package baekjoon.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Quiz_11725 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    ArrayList<Integer>[] arrayList = (ArrayList<Integer>[]) new ArrayList[n + 1];
    for (int i = 1; i <= n; i++) {
      arrayList[i] = new ArrayList<>();
    }

    for (int i = 0; i < n - 1; i++) {
      int u = scanner.nextInt();
      int v = scanner.nextInt();
      arrayList[u].add(v);
      arrayList[v].add(u);
    }

    boolean[] check = new boolean[n + 1];
    int[] parent = new int[n + 1];
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    check[1] = true;

    while (!queue.isEmpty()) {
      int x = queue.remove();
      for (int y : arrayList[x]) {
        if (check[y] == false) {
          check[y] = true;
          parent[y] = x;
          queue.add(y);
        }
      }
    }

    for (int i = 2; i <= n; i++) {
      System.out.println(parent[i]);
    }
  }
}
