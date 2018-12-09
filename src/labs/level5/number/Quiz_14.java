package labs.level5.number;

import java.util.Scanner;

// chebyshevtheo 확인요청
public class Quiz_14 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[8];
    boolean flag;
    int start;
    int end;
    int count = 0;
    for (int i = 0; i < 8; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < 8; i++) {
      start = array[i] + 1;
      end = array[i] * 2;
      for (int j = start; j < end; j++) {
        flag = true;
        for (int k = 2; k < start; k++) {
          if (j % k == 0) {
            flag = false;
            break;
          }
        }
        if (flag) {
          count++;
        }
      }
      if (array[i] == 1) {
        count++;
      }
      if (count > 0) {
        System.out.println(count);
      }
      count = 0;
    }
  }
}
