package baekjoon.structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Quiz_10845 {

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int value = 0;

    while (n > 0) {
      String input = scanner.next();
      if (input.equals("push")) {
        value = scanner.nextInt();
        queue.add(value);
      } else if (input.equals("front")) {
        System.out.println(queue.isEmpty() ? -1 : queue.peek());
      } else if (input.equals("back")) {
        System.out.println(queue.isEmpty() ? -1 : value);
      } else if (input.equals("size")) {
        System.out.println(queue.size());
      } else if (input.equals("pop")) {
        System.out.println(queue.isEmpty() ? -1 : queue.poll());
      } else if (input.equals("empty")) {
        System.out.println(queue.isEmpty() ? 1 : 0);
      }
      n--;
    }
    
  }
}
