package labs.level5.number;

import java.util.Scanner;

// combinationpascal 확인요청
public class Quiz_06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int a = fac(n);
    int b = fac(n - m);
    int c = fac(m);
    //n, m(0≤m≤n≤30)이 들어온다.
    if (m >= 0 && m <= n && n <= 30) {
      System.out.print(a / (c * b));
    }
  }

  static int fac(int n) {
    if (n > 0) {
      return n * fac(n - 1);
    } else {
      return 1;
    }
  }
}
