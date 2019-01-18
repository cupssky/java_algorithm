package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_1475 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int[] set = new int[10];

    String n = bufferedReader.readLine();
    int max = 0;

    for (int i = 0; i < n.length(); i++) {
      int value = n.charAt(i) - '0';
      set[value]++;
    }

    int count69 = set[6] + set[9];
    if (count69 % 2 == 0) {
      int value = count69 / 2;
      set[6] = value;
      set[9] = value;
    } else {
      int value = count69 / 2 + 1;
      set[6] = value;
      set[9] = value;
    }

    for (int i : set) {
      max = Math.max(max, i);
    }

    System.out.print(max);
  }
}
