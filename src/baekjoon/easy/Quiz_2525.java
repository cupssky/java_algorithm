package baekjoon.easy;

import java.util.Scanner;

public class Quiz_2525 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int timer = scanner.nextInt();
  
    if (b + timer >= 60) {
      a += (b + timer) / 60;
      b = (b + timer) % 60;

      if (a > 23) {
        a = 0;
        b = 0;
      }
    } else {
      b += timer;
    }

    System.out.print(a + " " + b);
  }

}
