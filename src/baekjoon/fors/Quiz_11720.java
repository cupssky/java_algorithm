package baekjoon.fors;

import java.util.Scanner;

public class Quiz_11720 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String input = scanner.next();
    int sum = 0;
    for (int i = n - 1; i >= 0; i--) {
      sum += input.charAt(i) - '0';
    }
    System.out.print(sum);
  }
}
