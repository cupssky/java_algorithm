package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_2745 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = bufferedReader.readLine().split(" ");
    String line = inputs[0];
    int value = Integer.parseInt(inputs[1]);
    int result = 0;
    for (int i = 0; i < line.length(); i++) {
      char c = line.charAt(i);
      if ('0' <= c && c <= '9') {
        result = result * value + (c - '0');
      } else {
        result = result * value + (c - 'A' + 10);
      }
    }

    System.out.println(result);
  }
}
