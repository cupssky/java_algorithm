package sw.d2;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 시각 덧셈
    |--------------------------------------------------------------------------
*/
public class Quiz_1976 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int num = 1;
    while (t-- > 0) {
      int fT = scanner.nextInt();
      int fM = scanner.nextInt();
      int aT = scanner.nextInt();
      int aM = scanner.nextInt();

      int time = fT + aT;
      int minute = fM + aM;
      if (time > 12) {
        time = time - 12;
      }
      if (minute > 59) {
        minute = minute - 60;
        time += 1;
      }
      System.out.println("#" + num + " " + time + " " + minute);
      num++;
    }
  }
}
