package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    ArrayList<Integer>[] arrayLists = new ArrayList[n + 1];
    boolean[] check = new boolean[n + 1];
    int[] parents = new int[n + 1];

    Queue<Integer> queue = new LinkedList<>();

    for (int i = 1; i <= n; i++) {
      arrayLists[i] = new ArrayList<>();
    }

    for (int i = 0; i < n - 1; i++) {
      int u = scanner.nextInt();
      int v = scanner.nextInt();
      arrayLists[u].add(v);
      arrayLists[v].add(u);
    }

    int start = 1;
    queue.add(start);
    check[start] = true;

    while (!queue.isEmpty()) {
      int x = queue.remove();
      for (int value : arrayLists[x]) {
        if (check[value] == false) {
          check[value] = true;
          parents[value] = x;
          queue.add(value);
        }
      }
    }

    for (int i = 2; i <= n; i++) {
      System.out.println(parents[i]);
    }
  }
}
