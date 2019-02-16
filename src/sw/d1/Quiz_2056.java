package sw.d1;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 연월일 달력 (기본)
    |--------------------------------------------------------------------------
*/
public class Quiz_2056 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();
    int t = scanner.nextInt();
    int num = 1;
    String[] month = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
    String[] days = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
    while (t-- > 0) {
      String inputs = scanner.next();
      String year = inputs.substring(0, 4);
      String mon = inputs.substring(4, 6);
      String day = inputs.substring(6, inputs.length());

      for (int i = 0; i < 12; i++) {
        if (month[i].equals(mon)) {
          int value = Integer.parseInt(days[i]);
          if (value >= Integer.parseInt(day)) {
            stringBuilder.append("#" + num + " " + year + "/" + mon + "/" + day + "\n");
            break;
          } else {
            stringBuilder.append("#" + num + " " + -1 + "\n");
          }
        } else if (mon.equals("00")) {
          stringBuilder.append("#" + num + " " + -1 + "\n");
          break;
        }
      }
      num++;
    }

    System.out.print(stringBuilder);
  }
}
