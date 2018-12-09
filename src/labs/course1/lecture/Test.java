package labs.course1.lecture;

import java.util.Scanner;

//선택 정렬 ㅡㅡ
public class Test {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
      int idx = i;
      for (int j = i; j < n; j++) {
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
