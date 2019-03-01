package baekjoon.divide;

import java.util.Arrays;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 숫자카드
    |--------------------------------------------------------------------------
*/
public class Quiz_10815 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();
    int n = scanner.nextInt();
    int[] a = new int[n + 1];

    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }

    Arrays.sort(a);

    int m = scanner.nextInt();
    int[] b = new int[m + 1];

    for (int i = 0; i < m; i++) {
      b[i] = scanner.nextInt();
      stringBuilder.append(search(a, b[i]) + " ");
    }
    System.out.print(stringBuilder);
  }

  private static int search(int[] array, int key) {
    int n = array.length;
    int left = 0;
    int right = n - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (array[mid] == key) {
        return 1;
      } else if (array[mid] < key) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return 0;
  }
}
