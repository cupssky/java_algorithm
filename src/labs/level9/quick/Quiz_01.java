package labs.level9.quick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_01 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] value = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(value[0]);
    int[] array = new int[n];
    String[] input = bufferedReader.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      array[i] = Integer.parseInt(input[i]);
    }
    quickSort(array, 0, n - 1);
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
    bufferedWriter.flush();
  }

  static void quickSort(int[] array, int start, int end) {
    if (start >= end) {
      return;
    }
    int pivot = array[start];
    int[] left = new int[100];
    int[] right = new int[100];

    int leftCnt = getLeft(array, start + 1, end, pivot, left);
    int rightCnt = getRight(array, start + 1, end, pivot, right);

    for (int i = 0; i < leftCnt; i++) {
      array[start + i] = left[i];
    }

    array[start + leftCnt] = pivot;

    for (int i = 0; i < rightCnt; i++) {
      array[start + leftCnt + 1 + i] = right[i];
    }

    quickSort(array, start, start + leftCnt - 1);
    quickSort(array, start + leftCnt + 1, end);
  }

  static int getLeft(int[] array, int start, int end, int pivot, int[] result) {
    int index = 0;
    for (int i = start; i <= end; i++) {
      if (array[i] > pivot) {
        result[index++] = array[i];
      }
    }
    return index;
  }

  static int getRight(int[] array, int start, int end, int pivot, int[] result) {
    int index = 0;
    for (int i = start; i <= end; i++) {
      if (array[i] <= pivot) {
        result[index++] = array[i];
      }
    }
    return index;
  }
}
