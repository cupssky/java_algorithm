package doit.chap01.practice;

import java.util.Scanner;

public class Practice_08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
    System.out.println(sum);
  }
}
