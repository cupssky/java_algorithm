package baekjoon.easy;

import java.util.Scanner;

public class Quiz_2588 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    char[] valueB = String.valueOf(b).toCharArray();

    int num3 = a * Integer.parseInt(String.valueOf(valueB[2]));
    int num4 = a * Integer.parseInt(String.valueOf(valueB[1]));
    int num5 = a * Integer.parseInt(String.valueOf(valueB[0]));
    int num6 = num3 + num4 * 10 + num5 * 100;

    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);
    System.out.println(num6);

  }

}
