package sw.d2;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 간단한 소인수분해
    |--------------------------------------------------------------------------
*/
public class Quiz_1945 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int num = 1;
    // 2 3 5 7 11
    while (t-- > 0) {
      int n = scanner.nextInt();
      int[] value = {2, 3, 5, 7, 11};
      int[] count = new int[5];

      for (int i = 0; i < 5; i++) {
        while (n % value[i] == 0) {
          count[i]++;
          n /= value[i];
        }
      }
      System.out.print("#" + num + " ");
      for (int i = 0; i < 5; i++) {
        System.out.print(count[i] + " ");
      }
      System.out.println();
      num++;
    }
  }
}
