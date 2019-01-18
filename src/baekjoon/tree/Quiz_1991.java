package baekjoon.tree;

import java.util.Scanner;

public class Quiz_1991 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    int[][] array = new int[26][2];
    for (int i = 0; i < n; i++) {
      String input = scanner.nextLine();
      int x = input.charAt(0) - 'A';
      char y = input.charAt(2);
      char z = input.charAt(4);
      if (y == '.') {
        array[x][0] = -1;
      } else {
        array[x][0] = y - 'A';
      }

      if (z == '.') {
        array[x][1] = -1;
      } else {
        array[x][1] = z - 'A';
      }
    }

    preOrder(array, 0);
    System.out.println();
    inOrder(array, 0);
    System.out.println();
    postOrder(array, 0);
  }

  private static void preOrder(int[][] array, int x) {
    if (x == -1) {
      return;
    }
    System.out.print((char) (x + 'A'));
    preOrder(array, array[x][0]);
    preOrder(array, array[x][1]);
  }

  private static void inOrder(int[][] array, int x) {
    if (x == -1) {
      return;
    }
    inOrder(array, array[x][0]);
    System.out.print((char) (x + 'A'));
    inOrder(array, array[x][1]);
  }

  private static void postOrder(int[][] array, int x) {
    if (x == -1) {
      return;
    }
    postOrder(array, array[x][0]);
    postOrder(array, array[x][1]);
    System.out.print((char) (x + 'A'));
  }
}

