package labs.basic;

import java.util.Scanner;

public class Quiz_27 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int S = scanner.nextInt();
    int g;
    int k = 1;
    int p = N;
    String result = "";
    for (int i = 0; i < N; i++) {
      g = i + k;
      for (int j = 0; j < p - 1; j++) {
        System.out.print(" ");
      }
      k++;
      for (int l = 0; l < g; l++) {
        result = result + S;
        S++;
        if (S > 9) {
          S -= 9;
        }
      }
      p--;
      if (i % 2 != 0) {
        System.out.println(result);
      } else {
        for (int v = result.length() - 1; v >= 0; v--) {
          System.out.print(result.charAt(v));
        }
        System.out.println();
      }
      result = "";
    }
  }
}
