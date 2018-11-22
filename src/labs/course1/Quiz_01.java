package labs.course1;

import java.util.Scanner;

public class Quiz_01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int day = scanner.nextInt();
    int count = 0;
    int[] array = new int[5];

    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
      for (int j = 1; j < 31; j++) {
        if (day == 0) {
          if (array[i] == 0) {
            count++;
            break;
          }
        } else {
          if (array[i] == day) {
            count++;
            break;
          }
          if (array[i] == day + 10) {
            count++;
            break;
          }
          if (array[i] == day + 11) {
            count++;
            break;
          }
        }
      }
    }
    System.out.print(count);
  }
}
