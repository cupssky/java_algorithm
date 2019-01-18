package doit.chap05;

import java.util.Scanner;

public class Recur {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    recur(n);
  }

  private static void recur(int n) {
    if (n > 0) {
      recur(n - 1);
      System.out.println(n);
      recur(n - 2);
    }
  }

  private static void recur2(int n) {
    if (n > 0) {
      recur(n - 1);
      System.out.println(n);
      recur(n - 2);
    }
  }
}

//1
//    2
//    3
//    1
//    4
//    1
//    2