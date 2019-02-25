package baekjoon.structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 조세퍼스 순열
    |--------------------------------------------------------------------------
*/
public class Quiz_1158 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    Queue<Integer> queue = new LinkedList<>();

    StringBuilder sb = new StringBuilder();
    sb.append("<");
    for (int i = 1; i <= n; i++) {
      queue.offer(i);
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < m; j++) {
        queue.offer(queue.poll());
      }
      if (i == n) {
        sb.append(queue.poll());
      } else {
        sb.append(queue.poll() + ", ");
      }
    }
    sb.append(">");
    System.out.print(sb);
  }
}
