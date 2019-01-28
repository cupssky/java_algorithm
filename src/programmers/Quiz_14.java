package programmers;

import java.util.Scanner;

//직사각형 별찍기
public class Quiz_14 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    for (int i = 0; i < b; i++) {
      for (int j = 0; j < a; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
