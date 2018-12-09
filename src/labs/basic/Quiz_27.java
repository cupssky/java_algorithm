package labs.basic;

import java.util.Scanner;

public class Quiz_27 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int s = scanner.nextInt();
    String value = "";
    for (int i = 1; i < n + 1; i++) {
      int idx = i;
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * i - 1; j++) {
        value += s++;
        if (s > 9) {
          s = 1;
        }
      }
      if (i % 2 == 0) {
        System.out.println(value);
      } else {
        for (int a = value.length() - 1; a >= 0; a--) {
          System.out.print(value.charAt(a));
        }
        System.out.println();
      }
      value = "";
    }
  }
}

