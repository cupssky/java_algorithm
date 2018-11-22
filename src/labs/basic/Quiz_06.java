package labs.basic;

import java.util.Scanner;

public class Quiz_06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    if (n % 2 == 0) {
      System.out.print("even");
    } else {
      System.out.print("not even");
    }
  }
}
