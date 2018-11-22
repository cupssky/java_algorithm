package labs.basic;

import java.util.Scanner;

public class Quiz_05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if (a - b < 0) {
      System.out.print(-1);
    } else {
      System.out.print(a - b);
    }
  }

}
