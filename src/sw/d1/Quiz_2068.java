package sw.d1;

import java.util.Arrays;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 최대값 구하기 (기본)
    |--------------------------------------------------------------------------
*/
public class Quiz_2068 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();
    int t = scanner.nextInt();
    int num = 1;
    while (t-- > 0) {
      int[] array = new int[10];
      for (int i = 0; i < 10; i++) {
        array[i] = scanner.nextInt();
      }
      stringBuilder.append("#").append(num).append(" ")
          .append(Arrays.stream(array).max().getAsInt())
          .append("\n");
      num++;
    }
    System.out.println(stringBuilder);
  }
}
