package labs.level5.number;

import java.util.Scanner;

// combinationpascal 확인요청
//  nCm = n-1Cm + n-1Cm-1
public class Quiz_06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    System.out.println(pasccal(n, m));
  }

  static int pasccal(int n, int m) {
    if (n == m && m == 0) {
      return 1;
    } else if (m < 0 || n < m) {
      return 0;
    } else {
      return pasccal(n - 1, m - 1) + pasccal(n - 1, m);
    }
  }
}
