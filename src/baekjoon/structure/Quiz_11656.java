package baekjoon.structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 접미사 배열
    |--------------------------------------------------------------------------
*/
public class Quiz_11656 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();
    ArrayList<String> list = new ArrayList<>();
    int n = 0;
    while (n < value.length()) {
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = n; i < value.length(); i++) {
        stringBuilder.append(value.charAt(i));
      }
      list.add(stringBuilder.toString());
      n++;
    }
    Collections.sort(list);
    for (String result : list) {
      System.out.println(result);
    }
  }
}
