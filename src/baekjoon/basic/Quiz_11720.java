package baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quiz_11720 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = scanner.nextInt();
    String[] inputs = bufferedReader.readLine().split("");
    int sum = 0;
    if (inputs.length <= n) {

      for (int i = 0; i < n; i++) {
        sum += Integer.parseInt(inputs[i]);
      }
      System.out.print(sum);

    }
  }
}
