package labs.level8;

import java.util.Scanner;

public class Test {

  static String[] output;
  static String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
      "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "h", "y", "z"};

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    if (n <= 26) {
      output = new String[n];
      boolean[] visited = new boolean[n];
      for (int i = 0; i < n; i++) {
        visited[i] = true;
        DFS(visited, n, k, i, 0);
        visited[i] = false;
      }
    }

  }

  public static void DFS(boolean[] visited, int n, int k, int start, int depth) {
    output[depth] = arr[start];
    if (depth == k - 1) {
      for (int i = 0; i < k; i++) {
        System.out.print(output[i]);
      }
      System.out.println();
      return;
    } else {
      for (int i = 0; i < n; i++) {
        if (visited[i]) {
          continue;
        }
        visited[i] = true;
        DFS(visited, n, k, i, depth + 1);
        visited[i] = false;
      }
    }
  }
}


