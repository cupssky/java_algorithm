package labs.level5.number;

import java.util.Scanner;

//PROSJEK 다시보기
public class Quiz_04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
      array[i] = array[i] * (i + 1) - sum;
      sum += array[i];
    }

    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
  }
}


