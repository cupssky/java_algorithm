package doit.chap03;

import java.util.Scanner;

public class SeqSearch {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n + 1];

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }
    int value = scanner.nextInt();
    System.out.println(seqSearch(array, n, value));
  }

  private static int seqSearch(int[] array, int n, int value) {
    array[n] = value;
    int i = 0;
    for (; i < n; i++) {
      if (array[i] == value) {
        break;
      }
    }
    return i == n ? -1 : i;
  }
}
