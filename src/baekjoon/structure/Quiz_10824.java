package baekjoon.structure;

import java.util.Scanner;

public class Quiz_10824 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();

    String first = "";
    first += a;
    first += b;

    String last = "";
    last += c;
    last += d;
    long value = Long.parseLong(first) + Long.parseLong(last);

    System.out.print(value);
  }
}
