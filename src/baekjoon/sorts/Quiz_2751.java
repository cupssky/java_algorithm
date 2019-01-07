package baekjoon.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz_2751 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    ArrayList<Integer> arrayList = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int value = scanner.nextInt();
      arrayList.add(value);
    }

    Collections.sort(arrayList);

    for (int i = 0; i < n; i++) {
      System.out.println(arrayList.get(i));
    }
  }
}
