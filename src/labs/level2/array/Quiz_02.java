package labs.level2.array;

import java.util.Scanner;

//최대값 출력하기
public class Quiz_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[9];
    int[] tempArray;
    for (int i = 0; i < 9; i++) {
      array[i] = scanner.nextInt();
    }
    tempArray = array.clone();
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 8; j++) {
        if (array[j] < array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < 9; i++) {
      if (tempArray[i] == array[0]) {
        System.out.println(array[0]);
        System.out.println(i + 1);
        break;
      }
    }
  }
}
