package baekjoon.ifs;

import java.util.Scanner;

public class Quiz_1110 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int start = n;
    int count = 0;
    int end = 0;

    String value = "";
    if (n >= 0 && n < 99) {
      while (end != start) {
        int f = n / 10;
        int l = n % 10;
        int last = (f + l) % 10;

        value += l;
        value += last;

        end = Integer.parseInt(value);
        n = end;
        count++;
        value = "";
      }
    }

    System.out.print(count);
  }
}
