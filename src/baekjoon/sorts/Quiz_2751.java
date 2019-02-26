package baekjoon.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 수정렬하기 2
    |--------------------------------------------------------------------------
*/
public class Quiz_2751 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();
    int n = scanner.nextInt();
    ArrayList<Integer> list = new ArrayList<>();

    while (n-- > 0) {
      list.add(scanner.nextInt());
    }
    Collections.sort(list);

    for (int i : list) {
      stringBuilder.append(i + "\n");
    }
    System.out.print(stringBuilder);
  }
}
