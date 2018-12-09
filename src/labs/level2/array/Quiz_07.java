package labs.level2.array;

import java.util.Scanner;

//binary
public class Quiz_07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String result = "";
    while (n > 0) {
      result += n % 2;
      n = n / 2;
    }
    for (int i = result.length() - 1; i >= 0; i--) {
      System.out.print(result.charAt(i));
    }
  }
}