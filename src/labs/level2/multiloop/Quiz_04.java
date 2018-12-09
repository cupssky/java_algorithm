package labs.level2.multiloop;

import java.util.Scanner;

public class Quiz_04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    boolean flag;
    for (int i = n; i <= m; i++) {
      flag = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        if (i != 1) {
          System.out.print(i + " ");
        }
      }
    }
  }
}
