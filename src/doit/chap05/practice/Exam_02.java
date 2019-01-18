package doit.chap05.practice;

import java.util.Scanner;

public class Exam_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    while (b != 0) {
      int r;
      r = a % b;
      a = b;
      b = r;
    }

    System.out.print(a);
  }
}
