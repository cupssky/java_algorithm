package baekjoon;

import java.util.Scanner;

public class Quiz_1924 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int after = 0;
    //1 2 3 4 5 6 7 8 9 10 11 12
    int[] month = new int[13];
    month[1] = month[3] = month[5] = month[7] = month[8] = month[10] = month[12] = 31;
    month[4] = month[6] = month[9] = month[11] = 30;
    month[2] = 28;

    for (int i = 1; i < 12; i++) {
      if (x == i) {
        break;
      }
      after += month[i];
    }

    after += y;

    switch (after % 7) {
      case 1:
        System.out.print("MON");
        break;
      case 2:
        System.out.print("TUE");
        break;
      case 3:
        System.out.print("WED");
        break;
      case 4:
        System.out.print("THU");
        break;
      case 5:
        System.out.print("FRI");
        break;
      case 6:
        System.out.print("SAT");
        break;
      case 0:
        System.out.print("SUN");
        break;
    }
  }
}
