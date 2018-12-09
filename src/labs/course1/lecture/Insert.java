package labs.course1.lecture;

import java.util.Scanner;

//원소를 차례대로 정렬된 배열에 삽입시킴
public class Insert {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }
    // i 왼쪽은 정렬이 되어있음, 왼쪽으로 넣어야 한다
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j >= 1; j--) {
        if (array[j - 1] > array[j]) {
          int temp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = temp;
        } else {
          break;
        }
      }
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

}
