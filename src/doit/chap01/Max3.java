package doit.chap01;

import java.util.Scanner;

public class Max3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int max = 0;
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    max = a;
    if (b > a) {
      max = b;
    }
    if (c > b) {
      max = c;
    }

    System.out.print(max);

  }
}
