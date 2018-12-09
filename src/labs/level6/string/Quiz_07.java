package labs.level6.string;

import java.util.Scanner;

//문자열 압축
public class Quiz_07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();

    String input = scanner.nextLine();
    int count = 0;

    char[] array = input.toCharArray();
    char value = ' ';

    //AAABBC
    for (int i = 0; i < array.length; i++) {
      if (value == ' ') {
        value = array[i];
        count++;
      } else if (array[i] == value) {
        count++;
      } else if (array[i] != value) {
        if (count > 1) {
          stringBuilder.append(String.valueOf(count) + value);
        } else {
          stringBuilder.append(value);
        }
        count = 0;
        value = array[i];
        count++;
      }
    }

    if (count > 1) {
      stringBuilder.append(String.valueOf(count) + value);
    } else {
      stringBuilder.append(value);
    }
    System.out.println(stringBuilder.toString());
  }
}
