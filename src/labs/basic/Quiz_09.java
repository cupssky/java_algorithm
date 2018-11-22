package labs.basic;

import java.util.Scanner;

public class Quiz_09 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    String calc = scanner.next();
    int b = scanner.nextInt();

    switch (calc) {
      case "+":
        System.out.print(a + b);
        break;
      case "-":
        System.out.print(a - b);
        break;
      case "*":
        System.out.print(a * b);
        break;
      case "/":
        System.out.print(a / b);
        break;
    }

  }

}
