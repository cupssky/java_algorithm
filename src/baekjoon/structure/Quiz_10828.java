package baekjoon.structure;

import java.util.Scanner;
import java.util.Stack;

public class Quiz_10828 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Stack<Integer> stack = new Stack<>();
    int value = 0;
    while (n-- > 0) {
      String input = scanner.next();
      if (input.equals("push")) {
        value = scanner.nextInt();
        stack.push(value);
      } else if (input.equals("pop")) {
        System.out.println(stack.isEmpty() ? -1 : stack.pop());
      } else if (input.equals("size")) {
        System.out.println(stack.size());
      } else if (input.equals("empty")) {
        System.out.println(stack.isEmpty() ? 1 : 0);
      } else if (input.equals("top")) {
        System.out.println(stack.isEmpty() ? -1 : stack.peek());
      }

    }
  }
}
