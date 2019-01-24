package programmers;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    String s = "abcde";
    String value = "";
    char[] input = s.toCharArray();
    Arrays.sort(input);
    s = String.valueOf(input);

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(s);
    value = String.valueOf(stringBuilder.reverse());

    System.out.print(value);
  }
}
