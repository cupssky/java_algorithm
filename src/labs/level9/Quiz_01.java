package labs.level9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Merge Sort
public class Quiz_01 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] value = bufferedReader.readLine().split(" ");

    int n = Integer.parseInt(value[0]);
    int[] array = new int[n];

    String[] input = bufferedReader.readLine().split(" ");

    for (int i = 0; i < n; i++) {
      array[i] = Integer.parseInt(String.valueOf(input[i]));
    }

    mergeSort(array, 0, n - 1);

    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }

    bufferedWriter.flush();
  }

  static void mergeSort(int[] array, int start, int end) {
    if (start >= end) {
      return;
    } else {
      int mid = (start + end) / 2;
      mergeSort(array, start, mid);
      mergeSort(array, mid + 1, end);
      merging(array, start, mid, mid + 1, end);
    }
  }

  static void merging(int[] array, int start1, int end1, int start2, int end2) {
    int p = start1;
    int q = start2;
    int[] temp = new int[array.length];
    int tempIndex = 0;

    while (p <= end1 && q <= end2) {
      if (array[p] <= array[q]) {
        temp[tempIndex++] = array[p];
        p++;
      } else {
        temp[tempIndex++] = array[q];
        q++;
      }
    }

    if (p > end1) {
      for (int i = q; i <= end2; i++) {
        temp[tempIndex++] = array[i];
      }
    } else {
      for (int i = p; i <= end1; i++) {
        temp[tempIndex++] = array[i];
      }
    }

    for (int i = start1; i <= end2; i++) {
      array[i] = temp[i - start1];
    }
  }
}
