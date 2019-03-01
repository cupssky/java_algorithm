package baekjoon.divide;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz_10816 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    int m = scanner.nextInt();
    int[] b = new int[m];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < m; i++) {
      b[i] = scanner.nextInt();
      map.put(b[i], 0);
    }

    for (int value : a) {
      if (map.containsKey(value)) {
        map.replace(value, map.get(value) + 1);
        System.out.print(map.get(value) + " ");
      }
    }

//    for (int value : map.keySet()) {
//      System.out.print(value + " ");
//    }
    System.out.println();
    for (int value : map.values()) {
      System.out.print(value + " ");
    }
  }

}
