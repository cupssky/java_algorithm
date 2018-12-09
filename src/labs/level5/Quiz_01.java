package labs.level5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_01 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int k = Integer.parseInt(input[1]);

    int[] array = new int[n];

    String[] inputArray = bufferedReader.readLine().split(" ");

    for (int i = 0; i < n; i++) {
      array[i] = Integer.parseInt(inputArray[i]);
    }

    for (int i = 0; i < n; i++) {
      for (int j = i; j >= 1; j--) {
        if (array[j] > array[j - 1]) {
          int temp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = temp;
        } else {
          break;
        }
      }
    }

    if (k > 0) {
      System.out.println(array[k - 1]);
    }
    bufferedWriter.flush();
  }

}
