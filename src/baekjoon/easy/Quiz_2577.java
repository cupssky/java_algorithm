package baekjoon.easy;

import java.util.Scanner;

//다시봐요.. 최빈값이랑..
public class Quiz_2577 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int[] array = new int[10];
    int number = a * b * c;

    while (number > 0) {
      array[number % 10]++;
      number /= 10;
    }

    for (int i = 0; i < array.length; ++i) {
      System.out.println(array[i]);
    }
  }
}
