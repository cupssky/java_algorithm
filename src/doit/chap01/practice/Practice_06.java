package doit.chap01.practice;

import java.util.Scanner;

public class Practice_06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int i = 1;
    int sum = 0;
    while (i <= n) {
      sum += i;
      i++;
    }
    System.out.println(sum);
    System.out.print(i);
  }

}
