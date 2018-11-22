package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Quiz_10828 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> stack = new Stack();

    int num = scanner.nextInt();
    for (int i = 0; i < num; i++) {
      String command = scanner.next();
      if (command.equals("push")) {
        int data = scanner.nextInt();
        stack.push(data);
      } else if (command.equals("top")) {
        System.out.println(stack.isEmpty() ? -1 : stack.pop());
      } else if (command.equals("size")) {
        System.out.println(stack.size());
      } else if (command.equals("empty")) {
        System.out.println(stack.isEmpty() ? 1 : 0);
      } else if (command.equals("top")) {
        System.out.println(stack.isEmpty() ? -1 : stack.peek());
      }
    }
  }
}
