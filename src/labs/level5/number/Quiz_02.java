package labs.level5.number;

import java.util.Scanner;

//beehive
public class Quiz_02 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(beebhive(n));
  }

  static int beebhive(int n) {
    if (n == 1) {
      return 1;
    } else {
      int i = 1;
      int value = 2;
      while (value <= n) {
        value += 6 * i++;
      }
      return i;
    }
  }
}

