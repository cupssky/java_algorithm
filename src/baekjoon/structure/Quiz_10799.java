package baekjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Quiz_10799 {

  // 12 345 67 89 01 23 4 56 789 01 2
  // () ((( () () )( () ) () ))( () )
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = bufferedReader.readLine().split("");
    Stack<Integer> stack = new Stack<>();
    int count = 0;

    for (int i = 0; i < inputs.length; i++) {
      if (inputs[i].equals("(")) {
        stack.push(i);
      } else {
        if (stack.peek() + 1 == i) {
          stack.pop();
          count += stack.size();
        } else {
          stack.pop();
          count += 1;
        }
      }
    }

    System.out.println(count);
  }
}
