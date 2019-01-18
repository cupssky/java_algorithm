package baekjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Quiz_1406 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String inputs = bufferedReader.readLine();

    Stack<Character> left = new Stack<>();
    Stack<Character> right = new Stack<>();
    int n = Integer.parseInt(bufferedReader.readLine());

    for (int i = 0; i < inputs.length(); i++) {
      left.push(inputs.charAt(i));
    }

    while (n-- > 0) {
      String[] values = bufferedReader.readLine().split(" ");
      char input = values[0].charAt(0);
      if (input == 'L') {
        if (!left.isEmpty()) {
          right.push(left.pop());
        }
      } else if (input == 'D') {
        if (!right.isEmpty()) {
          left.push(right.pop());
        }
      } else if (input == 'B') {
        if (!left.isEmpty()) {
          left.pop();
        }
      } else if (input == 'P') {
        char c = values[1].charAt(0);
        left.push(c);
      }
    }
    StringBuilder sb = new StringBuilder();
    while (!left.empty()) {
      right.push(left.pop());
    }
    while (!right.empty()) {
      sb.append(right.pop());
    }
    System.out.println(sb);
  }
}
