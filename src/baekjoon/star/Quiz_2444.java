package baekjoon.star;

import java.util.Scanner;

public class Quiz_2444 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < n - i + 1; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j < i * 2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (n - i) * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }


}

