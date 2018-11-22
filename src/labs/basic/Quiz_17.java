package labs.basic;

import java.util.Scanner;

public class Quiz_17 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;
    int n = scanner.nextInt();

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        flag = false;
        break;
      }
    }

    if (flag) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }

}
