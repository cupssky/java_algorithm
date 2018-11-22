package labs.basic;

import java.util.Scanner;

public class Quiz_10 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    if ((n % 4 == 0) && (n % 100 != 0)) {
      System.out.print("YES");
    } else if (n % 400 == 0) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }
}
