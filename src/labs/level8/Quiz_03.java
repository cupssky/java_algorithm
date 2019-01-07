package labs.level8;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_03 {

  static boolean[] visited = new boolean[10];
  static ArrayList<String> list = new ArrayList<>();
  static String[] input;
  static int k;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    k = scanner.nextInt();

    for (int i = 0; i < 10; i++) {
      visited[i] = true;
    }
  }

  private static void dfs() {

  }
}
