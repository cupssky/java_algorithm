package labs.level5.number;
//pfactorization

import java.util.Scanner;

public class Quiz_13 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int divide = 2;

    while (n > 1) {
      if (n % divide == 0) {
        System.out.println(divide);
        n = n / divide;
      } else {
        divide++;
      }
    }
  }
}

