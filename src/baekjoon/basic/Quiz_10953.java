package baekjoon.basic;

import java.util.Scanner;

public class Quiz_10953 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    String[] value = new String[t];

    for (int i = 0; i < t; i++) {
      value[i] = scanner.next();
    }

    for (int i = 0; i < t; i++) {
      System.out.println(
          Integer.parseInt(value[i].split(",")[0]) + Integer.parseInt(value[i].split(",")[1]));
    }
  }
}
