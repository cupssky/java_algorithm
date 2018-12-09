package labs.level5.number;

import java.util.Scanner;

//lcm
public class Quiz_08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextInt();
    long b = scanner.nextInt();
    long result = 1;
    long tempA = a;
    long tempB = b;
    if (a < b) {
      a = tempB;
      b = tempA;
    }

    while (result > 0) {
      result = a % b;
      a = b;
      b = result;
    }

    System.out.println(tempA * tempB / a);


  }
}
