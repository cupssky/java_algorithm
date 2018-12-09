package labs.level3.simple1;

import java.util.Scanner;

//유클리드 호재법, 최소 , 최대
public class Quiz_05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int tempA = a;
    int tempB = b;

    int result = 1;

    if (a < b) {
      a = tempB;
      b = tempA;
    }

    while (result > 0) {
      result = a % b;
      a = b;
      b = result;
    }
    System.out.println(a);
    System.out.println(tempA * tempB / a);
  }
}
