package sw.d2;

import java.util.Scanner;

public class Quiz_1946 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int num = 1;
    while (t-- > 0) {
      StringBuilder stringBuilder = new StringBuilder();
      int n = scanner.nextInt();
      while (n-- > 0) {
        String val = scanner.next();
        int cnt = scanner.nextInt();
        while (cnt-- > 0) {
          stringBuilder.append(val);
        }
      }
      String result = stringBuilder.toString();
      System.out.println("#" + num);
      num++;
      for (int i = 0; i < result.length(); i++) {
        System.out.print(result.charAt(i));
        if (i % 10 == 9) {
          if (i != 0) {
            System.out.println();
          }
        }
      }
    }
  }
}
