package baekjoon.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_9012 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    int count = 0;
    for (int i = 0; i < n; i++) {
      String inputs = bufferedReader.readLine();
      for (int j = 0; j < inputs.length(); j++) {
        char temp = inputs.charAt(j);
        if (temp == '(') {
          count++;
          System.out.println(1);
        } else {
          if (count > 0) {
            count--;
            System.out.println(-1);
          } else {
            continue;
          }
        }
      }
      if (count == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
