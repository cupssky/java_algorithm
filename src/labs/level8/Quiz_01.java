package labs.level8;

import java.util.Scanner;

//순열 구하기
public class Quiz_01 {

//  private final static String[] ARRAY = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
//      "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "h", "y", "z"};

  private static int N;
  private static int[] CHECK = new int[26];

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    N = n;
    permutation(n, k, 0);
  }

  private static void permutation(int n, int k, int index) {
    if (N == index) {
      return;
    } else {
      for (int i = 0; i < n; i++) {
        CHECK[i] = 1;

      }
      permutation(n, k, index + 1);
    }
  }
}
