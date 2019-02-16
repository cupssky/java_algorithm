package sw.d2;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 날짜 계산기
    |--------------------------------------------------------------------------
*/
public class Quiz_1948 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int[] monthOfDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int sum = 0;
    int n = 1;
    while (t-- > 0) {
      int fM = scanner.nextInt();
      int fD = scanner.nextInt();
      int aM = scanner.nextInt();
      int aD = scanner.nextInt();

      if (fM != aM) {
        sum += monthOfDays[fM] - fD + 1;
        sum += aD;
        for (int i = fM + 1; i <= aM - 1; i++) {
          sum += monthOfDays[i];
        }
      } else {
        sum += aD;
      }
      System.out.println("#" + n + " " + sum);

      n++;
      sum = 0;
    }
  }
}
