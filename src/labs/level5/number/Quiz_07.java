package labs.level5.number;

import java.util.Scanner;

//combinationzero 나중에
public class Quiz_07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    long five = fiveCount(n) - fiveCount(n - m) - fiveCount(m);
    long two = twoCount(n) - twoCount(n - m) - twoCount(m);

    if (m <= n) {
      if (five >= two) {
        System.out.print(two);
      } else if (two >= five) {
        System.out.print(five);
      }
    }
  }

  private static int fiveCount(int num) {
    int count = 0;
    for (long i = 5; i <= num; i *= 5) {
      count += num / i;
    }
    return count;
  }

  private static int twoCount(int num) {
    int count = 0;
    for (long i = 2; i <= num; i *= 2) {
      count += num / i;
    }
    return count;
  }
}
