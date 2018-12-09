package labs.level3;

import java.util.Scanner;

//최대 최소
public class Quiz_05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int tempA = a;
    int tempB = b;
    int result = 0;

    if (a < b) {
      a = tempB;
      b = tempA;
    }

    while (result > 0) {
      result = a;
      a = a % b;
    }
    System.out.println(result);
    System.out.println(a);
  }
}

