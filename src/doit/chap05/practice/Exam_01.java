package doit.chap05.practice;

import java.util.Scanner;

public class Exam_01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = 1;

    while (n > 1) {
      sum *= n;
      n--;
    }
    System.out.print(sum);
  }
}
