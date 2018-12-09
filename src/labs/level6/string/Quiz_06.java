package labs.level6.string;

import java.util.Scanner;

//팰린드롬 조사
public class Quiz_06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    char[] array = input.toCharArray();
    boolean flag = false;
    if (array.length > 1 && array.length <= 1000) {
      for (int i = 0; i < array.length / 2; i++) {
        if (array[i] == array[array.length - 1 - i]) {
          flag = true;
        } else {
          flag = false;
          break;
        }
      }
      if (flag) {
        System.out.print("YES");
      } else {
        System.out.print("NO");
      }
    } else if (array.length == 1) {
      System.out.print("YES");
    }
  }
}
