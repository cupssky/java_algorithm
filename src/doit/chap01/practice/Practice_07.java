package doit.chap01.practice;

import java.util.Scanner;

public class Practice_07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int n = scanner.nextInt();
    for (int i = 1; i <= n; i++) {
      sum += i;
      System.out.print(i);
    }
    System.out.println(sum);
  }
}
