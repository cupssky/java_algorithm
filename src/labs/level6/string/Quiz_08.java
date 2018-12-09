package labs.level6.string;

import java.math.BigInteger;
import java.util.Scanner;

//큰 자릿수 덧셈
public class Quiz_08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BigInteger a = new BigInteger(String.valueOf(scanner.nextLine()));
    BigInteger b = new BigInteger(String.valueOf(scanner.nextLine()));
    System.out.println(a.add(b));
  }
}
