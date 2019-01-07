package baekjoon.structure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Quiz_10866 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();

    int n = scanner.nextInt();
    int value = 0;

    while (n-- > 0) {
      String input = scanner.next();
      if (input.equals("push_front")) {
        value = scanner.nextInt();
        deque.addFirst(value);
      } else if (input.equals("push_back")) {
        value = scanner.nextInt();
        deque.addLast(value);
      } else if (input.equals("pop_front")) {
        System.out.println(deque.isEmpty() ? -1 : deque.removeFirst());
      } else if (input.equals("pop_back")) {
        System.out.println(deque.isEmpty() ? -1 : deque.removeLast());
      } else if (input.equals("size")) {
        System.out.println(deque.size());
      } else if (input.equals("front")) {
        System.out.println(deque.isEmpty() ? -1 : deque.peekFirst());
      } else if (input.equals("back")) {
        System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
      } else if (input.equals("empty")) {
        System.out.println(deque.isEmpty() ? 1 : 0);
      }
    }
  }
}
