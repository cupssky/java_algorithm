package doit.chap03;

import java.util.Scanner;

public class SeqSearch {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int[] array = new int[num];
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }

    System.out.println(seqSearch(array, num, scanner.nextInt()));

  }

  static int seqSearch(int[] array, int num, int key) {
    int i = 0;

    while (true) {
      if (i == num) {
        return -1;
      } else if (array[i] == key) {
        return i;
      }
      i++;
    }
  }
}
