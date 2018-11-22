package labs.course1;

import java.util.Scanner;

public class Quiz_07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int value = 1;

    int tempA = a;
    int tempB = b;

    if (a < b) {
      a = tempB;
      b = tempA;

    }
    // 24 18
    while (value > 0) {
      value = a % b;
      a = b;
      b = value;
    }

    System.out.println(a);
    System.out.println(tempA * tempB / a);
  }
}
