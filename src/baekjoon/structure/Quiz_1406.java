package baekjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
    |--------------------------------------------------------------------------
    | Note. 에디터
    |--------------------------------------------------------------------------
*/
public class Quiz_1406 {

  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String value = bufferedReader.readLine();
    StringBuilder stringBuilder = new StringBuilder();

    int t = Integer.parseInt(bufferedReader.readLine());

    Stack<Character> left = new Stack<>();
    Stack<Character> right = new Stack<>();

    for (char i : value.toCharArray()) {
      left.add(i);
    }

    while (t-- > 0) {
      String[] button = bufferedReader.readLine().split(" ");
      if (button[0].equals("L")) {
        if (!left.isEmpty()) {
          right.add(left.pop());
        }
      } else if (button[0].equals("D")) {
        if (!right.isEmpty()) {
          left.add(right.pop());
        }
      } else if (button[0].equals("B")) {
        if (!left.isEmpty()) {
          left.pop();
        }
      } else if (button[0].equals("P")) {
        String p = button[1];
        left.add(p.charAt(0));
      }
    }
    while (!right.isEmpty()) {
      left.add(right.pop());
    }
    while (!left.isEmpty()) {
      stringBuilder.append(left.pop());
    }

    System.out.println(stringBuilder.reverse());
  }
}
