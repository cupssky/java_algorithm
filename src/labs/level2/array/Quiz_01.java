package labs.level2.array;

import java.util.Scanner;

//역으로 출력하기
public class Quiz_01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = n - 1; i >= 0; i--) {
      System.out.print(array[i] + " ");
    }

  }

}
