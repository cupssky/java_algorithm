package baekjoon.math;

import java.util.Scanner;

public class Quiz_1212 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] eight = {"000", "001", "010", "011", "100", "101", "110", "111"};
    String inputs = scanner.nextLine();
    boolean start = true;

    if (inputs.length() == 1 && inputs.charAt(0) == '0') {
      System.out.print(0);
    }
    for (int i = 0; i < inputs.length(); i++) {
      int n = inputs.charAt(i) - '0';
      if (start == true && n < 4) {
        if (n == 0) {
          continue;
        } else if (n == 1) {
          System.out.print("1");
        } else if (n == 2) {
          System.out.print("10");
        } else if (n == 3) {
          System.out.print("11");
        }
        start = false;
      } else {
        System.out.print(eight[n]);
        start = false;
      }
    }
  }
}
