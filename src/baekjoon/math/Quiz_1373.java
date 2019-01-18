package baekjoon.math;

import java.util.Scanner;

//
public class Quiz_1373 {

  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    String inputs = scanner.nextLine();
    int n = inputs.length();

    if (n % 3 == 1) {
      System.out.print(inputs.charAt(0));
    } else if (n % 3 == 2) {
      System.out.print((inputs.charAt(0) - '0') * 2 + (inputs.charAt(1) - '0'));
    }
    for (int i = n % 3; i < n; i += 3) {
      System.out
          .print((inputs.charAt(i) - '0') * 4 + (inputs.charAt(i + 1) - '0') * 2 + (
              inputs.charAt(i + 2) - '0'));
    }
    System.out.println();

  }
}
