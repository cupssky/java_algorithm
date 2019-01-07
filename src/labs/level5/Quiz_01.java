package labs.level5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_01 {

  static int[] ARRAY;

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    ARRAY = new int[100000];

    String[] input = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int k = Integer.parseInt(input[1]);
    int count = 0;

    String[] inputArray = bufferedReader.readLine().split(" ");

    for (int i = 0; i < n; i++) {
      ARRAY[i] = Integer.parseInt(inputArray[i]);
    }

    for (int i = 0; i < n; i++) {
      for (int j = i; j >= 1; j--) {
        if (ARRAY[j - 1] < ARRAY[j]) {
          int temp = ARRAY[j - 1];
          ARRAY[j - 1] = ARRAY[j];
          ARRAY[j] = temp;
        } else {
          break;
        }
      }
    }
//    for (int i = 0; i < n; i++) {
//      System.out.print(ARRAY[i] + " ");
//    }
//    if (k > 0) {
//      System.out.println(ARRAY[k - 1]);
//    }
    bufferedWriter.flush();
  }
}
