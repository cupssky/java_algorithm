package labs.level5.number;

import java.util.Scanner;

public class Quiz_12 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int dis = y - x;

    int value = 0;
    int result = 1;

    while (value < dis) {
      result++;
      value += (result / 2);
    }

    System.out.println(result - 1);
  }
}




