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
      for (int j = 0; j < n - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        } else {
          break;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
