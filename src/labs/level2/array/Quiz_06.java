package labs.level2.array;

import java.util.Scanner;

//최대값
public class Quiz_06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int maxValue = 0;
    for (int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      int max = 0;
      int value = 0;
      if (a == b && b == c) {
        value = 10000 + a * 1000;
      } else if (a == b || a == c) {
        value = a * 100 + 1000;
      } else {
        if (max < a) {
          max = a;
          if (max < b) {
            max = b;
            if (max < c) {
              max = c;
            }
          }
        }
        value = max * 100;
      }
      if (maxValue < value) {
        maxValue = value;
      }
    }
    System.out.print(maxValue);
  }

}
