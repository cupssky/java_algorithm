package labs.level5.number;

import java.util.Scanner;

//street tree
public class Quiz_09 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int start = 0;
    int end = 0;
    int count = 0;
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    // 1 3 7 13 ,,  5 9 11 ,  2 6 12 18  , 4 8 10 14 16
    for (int i = 0; i < n - 1; i++) {
      start = array[i];
      end = array[i + 1];
      System.out.println(start + "," + end);
      for (int j = start + 1; j < end; j++) {
        if (j + 2 < end) {
          if (j + 2 == start + 2) {
            System.out.println(j);
          }
        }
      }
    }
  }

  static int ucd(int a, int b) {
    if (b > 0) {
      return ucd(b, a % b);
    } else {
      return a;
    }
  }
}

