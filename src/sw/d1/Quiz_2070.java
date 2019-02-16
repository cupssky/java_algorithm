package sw.d1;

import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 큰놈, 작은놈, 같은놈 (기본)
    |--------------------------------------------------------------------------
*/
public class Quiz_2070 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();
    int t = scanner.nextInt();
    int num = 1;
    while (t-- > 0) {
      int[] value = new int[2];
      for (int j = 0; j < 2; j++) {
        value[j] = scanner.nextInt();
      }
      if (value[0] < value[1]) {
        stringBuilder.append("#").append(num).append(" ").append("<").append("\n");
      } else if (value[0] > value[1]) {
        stringBuilder.append("#").append(num).append(" ").append(">").append("\n");
      } else {
        stringBuilder.append("#").append(num).append(" ").append("=").append("\n");
      }
      num++;
    }
    System.out.println(stringBuilder);
  }
}
