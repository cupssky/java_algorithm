package baekjoon.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Quiz_2667 {

  //상하좌우
  static final int[] dx = {0, 0, -1, 1};
  static final int[] dy = {1, -1, 0, 0};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] a = new int[n][n];
    for (int i = 0; i < n; i++) {
      String s = scanner.nextLine();
      for (int j = 0; j < s.length(); j++) {
        a[i][j] = s.charAt(j) - '0';
      }
    }

    int count = 0;
    int[][] group = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (a[i][j] == 1 && group[i][j] == 0) {
          bfs(a, group, i, j, ++count, n);
        }
      }
    }
    int[] ans = new int[count];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (group[i][j] != 0) {
          ans[group[i][j] - 1] += 1;
        }
      }
    }
    Arrays.sort(ans);
    System.out.println(count);
    for (int i = 0; i < count; i++) {
      System.out.println(ans[i]);
    }
  }

  private static void bfs(int[][] a, int[][] group, int x, int y, int cnt, int n) {
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair(x, y));
    while (!queue.isEmpty()) {
      Pair p = queue.remove();
      x = p.x;
      y = p.y;
      for (int k = 0; k < 4; k++) {
        int nx = x + dx[k];
        int ny = y + dy[k];
        if (0 <= nx && nx < n && 0 <= ny && ny < n) {
          if (a[nx][ny] == 1 && group[nx][ny] == 0) {
            queue.add(new Pair(nx, ny));
            group[nx][ny] = cnt;
          }
        }
      }
    }
  }
}


class Pair {

  int x;
  int y;

  Pair(int x, int y) {
    this.x = x;
    this.y = y;
  }
}