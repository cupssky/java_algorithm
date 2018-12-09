package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Quiz_11720 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = scanner.nextInt();
    int[] array = new int[n];
    int sum = 0;
    String[] value = br.readLine().split("");
    for (int i = n - 1; i >= 0; i--) {
      array[i] = Integer.parseInt(value[i]);
      sum += array[i];
    }

    System.out.print(sum);
    bw.flush();
  }
}
