package baekjoon.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_2501 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str1[] = br.readLine().split(" ");

    int n = Integer.parseInt(str1[0]);
    int k = Integer.parseInt(str1[1]);

    String result = "";
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        result += i;
      }
    }

    if (result.length() < k) {
      System.out.println(0);
    } else {
      System.out.println(result.charAt(k - 1));
    }

    bw.write("0");
    bw.flush();
  }
}

