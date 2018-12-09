package labs.level6.variable;

import java.util.Scanner;

public class Quiz_01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    String value = scanner.next();
    int b = scanner.nextInt();

    switch (value) {
      case "+":
        System.out.print(a + b);
        break;
      case "*":
        System.out.print(a * b);
        break;
      case "/":
        System.out.print(a / b);
        break;
      case "-":
        System.out.print(a - b);
        break;
    }
  }

}
