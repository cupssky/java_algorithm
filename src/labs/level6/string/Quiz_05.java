package labs.level6.string;

import java.util.Scanner;

//문자열포함관계조사
public class Quiz_05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    String b = scanner.nextLine();
    if (a.contains(b)) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }
}
