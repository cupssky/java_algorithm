package baekjoon.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 좌표 정렬하기
    |--------------------------------------------------------------------------
*/
public class Quiz_11650 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    ArrayList<Point> list = new ArrayList<>();

    while (n-- > 0) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      list.add(new Point(x, y));
    }
    Collections.sort(list, new Comparator<Point>() {
      @Override
      public int compare(Point o1, Point o2) {
        if (o1.x == o2.x) {
          return Integer.compare(o1.y, o2.y);
        } else {
          return Integer.compare(o1.x, o2.x);
        }
      }
    });

    for (Point value : list) {
      System.out.println(value.x + " " + value.y);
    }
  }

  static class Point {

    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}


