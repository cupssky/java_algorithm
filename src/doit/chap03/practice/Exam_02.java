package doit.chap03.practice;

import java.util.Scanner;

public class Exam_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    String[] blank = new String[n];

    for (int i = 0; i < n; i++) {
      blank[i] = " ";
      array[i] = scanner.nextInt();
    }

    search(array, n, scanner.nextInt());
  }

  private static int search(int[] array, int n, int key) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (i >= 1) {
        stringBuilder.append("  ");
      }
      System.out.print(stringBuilder + "*");
      System.out.println();
      for (int k = 0; k < n; k++) {
        System.out.print(array[k] + " ");
      }
      System.out.println();
      if (array[i] == key) {
        return i; // 검색성공
      }
    }

    return -1; // 검색실패
  }
}

