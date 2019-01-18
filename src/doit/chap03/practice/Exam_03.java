package doit.chap03.practice;

import java.util.Scanner;

public class Exam_03 {

  // {1, 9, 2, 9, 4, 6, 7, 9}
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    int[] idx = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    System.out.print(searchIdx(a, n, scanner.nextInt(), idx));
  }

  private static int searchIdx(int[] a, int n, int value, int[] idx) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] == value) {
        idx[count++] = i;
      }
    }
    return count;
  }

}
