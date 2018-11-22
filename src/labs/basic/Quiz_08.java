package labs.basic;

import java.util.Scanner;

public class Quiz_08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int max = 0;

    if (max < a) {
      max = a;
    }
    if (max < b) {
      max = b;
    }
    if (max < c) {
      max = c;
    }

    System.out.print(max);
  }
}
