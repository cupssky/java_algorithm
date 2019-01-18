package baekjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_9012 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    while (n-- > 0) {
      System.out.println(isValid(bufferedReader.readLine()));
    }
  }

  public static String isValid(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        count++;
      } else {
        count--;
      }
      if (count < 0) {
        return "NO";
      }
    }
    if (count == 0) {
      return "YES";
    } else {
      return "NO";
    }
  }
}
