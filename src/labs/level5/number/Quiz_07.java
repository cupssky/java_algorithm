package labs.level5.number;

import java.util.Scanner;

//combinationzero
public class Quiz_07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long m = scanner.nextLong();
    long nFac = fac(n);
    long mFac = fac(m);
    long nMfac = fac(n - m);
    long value = nFac / (mFac * nMfac);
    System.out.println(value);
  }

  static long fac(long n) {
    if (n > 0) {
      return n * fac(n - 1);
    } else {
      return 1;
    }
  }
}
