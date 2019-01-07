package baekjoon.arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_2920 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] input = bufferedReader.readLine().split(" ");
    int asFlag = 0;
    int deFlag = 0;

    for (int i = 1; i < input.length; i++) {
      if (Integer.parseInt(input[i - 1]) <= Integer.parseInt(input[i])) {
        asFlag += 1;
      } else if (Integer.parseInt(input[i - 1]) >= Integer.parseInt(input[i])) {
        deFlag += 1;
      }
    }

    if (asFlag == 7) {
      System.out.print("ascending");
    } else if (deFlag == 7) {
      System.out.print("descending");
    } else {
      System.out.print("mixed");
    }

    bufferedWriter.flush();
  }
}
