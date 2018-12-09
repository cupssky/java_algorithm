package labs.level6.string;

import java.util.Scanner;

//대소문자 변환
public class Quiz_01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();
    char[] array = value.toCharArray();

    for (int i = 0; i < array.length; i++) {
      if ('a' <= array[i] && array[i] <= 'z') {
        array[i] = (char) (array[i] - 32);
      } else if ('A' <= array[i] && array[i] <= 'Z') {
        array[i] = (char) (array[i] + 32);
      }
    }
    System.out.print(array);
  }
}


