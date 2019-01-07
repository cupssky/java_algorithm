package labs.level10.binary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Quiz_01 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int q = Integer.parseInt(input[1]);
    int[] nArray = new int[n];
    int[] qArray = new int[q];

    String[] nInput = bufferedReader.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      nArray[i] = Integer.parseInt(nInput[i]);
    }
    Arrays.sort(nArray);
    String[] qInput = bufferedReader.readLine().split(" ");
    for (int i = 0; i < q; i++) {
      qArray[i] = Integer.parseInt(qInput[i]);
      if (binarySearch(nArray, qArray[i]) != -1) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    bufferedWriter.flush();
  }

  static int binarySearch(int[] array, int value) {
    int start = 0;
    int end = array.length - 1;
    int mid;

    while (start <= end) {
      mid = (start + end) / 2;
      if (array[mid] == value) {
        return 1;
      } else {
        if (array[mid] > value) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }

}
