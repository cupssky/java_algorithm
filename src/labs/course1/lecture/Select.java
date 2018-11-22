package labs.course1.lecture;

import java.util.Scanner;

//최솟값을 앞으로 이동시킴
public class Select {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < array.length; i++) {
      int idx = i;
      for (int j = i; j < array.length; j++) {
        if (array[idx] > array[j]) {
          idx = j;
        }
      }

      int temp = array[i];
      array[i] = array[idx];
      array[idx] = temp;
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
