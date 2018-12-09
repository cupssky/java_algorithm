package labs.level7;

import java.util.Scanner;

//바이너리, binary
public class Quiz_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    binary(n);
  }

  static void binary(int n) {
    if (n == 1) {
      System.out.print(1);
    } else if (n == 0) {
      System.out.print(0);
    } else {
      binary(n / 2);
      n = n % 2;
      System.out.print(n);
    }
  }
}
