package labs.level9.merge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Merge Sort
public class Quiz_01 {

  private static int[] sorted;

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] value = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(value[0]);
    int[] array = new int[n];
    sorted = new int[n];
    String[] input = bufferedReader.readLine().split(" ");

    for (int i = 0; i < n; i++) {
      array[i] = Integer.parseInt(input[i]);
    }

    mergeSort(array, 0, n - 1);
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
    bufferedWriter.flush();
  }

  private static void mergeSort(int[] array, int start, int end) {
    if (start >= end) {
      return;
    } else {
      int mid = (start + end) / 2;
      mergeSort(array, start, mid);
      mergeSort(array, mid + 1, end);
      merging(array, start, mid, end);
    }
  }

  private static void merging(int[] array, int start, int mid, int end) {
    int start1 = start;
    int start2 = start;
    int mid1 = mid + 1;
    int end1 = end;

    while (start1 <= mid && mid1 <= end1) {
      if (array[start1] <= array[mid1]) {
        sorted[start2++] = array[start1];
      } else {
        sorted[start2++] = array[mid1];
      }
    }

    if (start > mid) {
      for (int i = mid1; i < end1; i++) {
        sorted[start2++] = array[i];
      }
    } else {
      for (int i = start1; i < mid; i++) {
        sorted[start2++] = array[i];
      }
    }

    for (int i = start; i <= end; i++) {
      array[i] = sorted[i];
    }
  }
}
