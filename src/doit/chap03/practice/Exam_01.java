package doit.chap03.practice;

import java.util.Scanner;

public class Exam_01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n + 1];
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }
    System.out.print(seqSearch(array, n, scanner.nextInt()));
  }

  private static int seqSearch(int[] array, int n, int key) {
    array[n] = key;
    int i = 0;
    for (; i <= n; i++) {
      if (array[i] == key) {
        break;
      }
    }
    return i == n ? -1 : i;
  }
}
