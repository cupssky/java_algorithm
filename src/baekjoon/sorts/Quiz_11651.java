package baekjoon.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 좌표 정렬하기 2
    |--------------------------------------------------------------------------
*/
public class Quiz_11651 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int[][] a = new int[t][2];
    ArrayList<int[]> list = new ArrayList<>();

    while (t-- > 0) {
      a[t][0] = scanner.nextInt();
      a[t][1] = scanner.nextInt();
      list.add(a[t]);
    }
    Collections.sort(list, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if (o1[1] == o2[1]) {
          return Integer.compare(o1[0], o2[0]);
        } else {
          return Integer.compare(o1[1], o2[1]);
        }
      }
    });

    for (int[] value : list) {
      System.out.println(value[0] + " " + value[1]);
    }
  }
}
