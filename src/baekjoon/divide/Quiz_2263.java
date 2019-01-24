package baekjoon.divide;

import java.util.Scanner;

public class Quiz_2263 {

  static int[] inOrder = new int[100000];
  static int[] postOrder = new int[100000];
  static int[] position = new int[100001];

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      inOrder[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
      postOrder[i] = scanner.nextInt();
    }
    for (int i = 0; i < n; i++) {
      position[inOrder[i]] = i;
    }

    solve(0, n - 1, 0, n - 1);
  }

  private static void solve(int inStart, int inEnd, int postStart, int postEnd) {
    if (inStart > inEnd || postStart > postEnd) {
      return;
    }
    int root = postOrder[postEnd];
    System.out.print(root + " ");

    int p = position[root];
    int left = p - inStart;
    solve(inStart, p - 1, postStart, postStart + left - 1);
    solve(p + 1, inEnd, postStart + left, postEnd - 1);
  }
}
