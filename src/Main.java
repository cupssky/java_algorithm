import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

  public static final int[] dx = {0, 0, 1, -1};
  public static final int[] dy = {1, -1, 0, 0};

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int[][] a = new int[x][y];
    scanner.nextLine();
    for (int i = 0; i < x; i++) {
      String s = scanner.nextLine();
      for (int j = 0; j < y; j++) {
        a[i][j] = s.charAt(j) - '0';
      }
    }

    int[][] dist = new int[x][y];
    boolean[][] check = new boolean[x][y];
    Queue<Pair> q = new LinkedList<>();
    q.add(new Pair(0, 0));
    check[0][0] = true;
    dist[0][0] = 1;
    while (!q.isEmpty()) {
      Pair p = q.remove();
      int px = p.x;
      int py = p.y;
      for (int k = 0; k < 4; k++) {
        int nx = px + dx[k];
        int ny = py + dy[k];
        if (0 <= nx && nx < x && 0 <= ny && ny < y) {
          if (check[nx][ny] == false && a[nx][ny] == 1) {
            q.add(new Pair(nx, ny));
            dist[nx][ny] = dist[px][py] + 1;
            check[nx][ny] = true;
          }
        }
      }
    }
    System.out.print(dist[x - 1][y - 1]);

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