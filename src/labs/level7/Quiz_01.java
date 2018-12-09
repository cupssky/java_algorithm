package labs.level7;

import java.util.Scanner;

//팩토리얼
public class Quiz_01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.print(recur(n));
  }

  static int recur(int n) {
    if (n == 1) {
      return n;
    } else {
      return n * recur(n - 1);
    }
  }
}
