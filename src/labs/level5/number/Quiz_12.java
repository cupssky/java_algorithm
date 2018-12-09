package labs.level5.number;

import java.util.Scanner;

//fmttalpha 모르겠다
public class Quiz_12 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int step = 0;
    int count = 0;
    for (int i = x; x <= y; i++) {

      if (step == count) {
        step += 1;
      } else if (step == count) {
        step += count;
      }
      count++;
    }
  }
}
