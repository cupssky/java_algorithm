package sw.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
    |--------------------------------------------------------------------------
    | Note. 홀수 더하기 (기본)
    |--------------------------------------------------------------------------
*/
public class Quiz_2072 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bufferedReader.readLine());
    StringBuilder stringBuilder = new StringBuilder();
    int num = 1;
    while (t-- > 0) {
      int[] array = new int[10];
      int sum = 0;
      String[] input = bufferedReader.readLine().split(" ");
      for (int i = 0; i < 10; i++) {
        array[i] = Integer.parseInt(input[i]);
      }
      sum = Arrays.stream(array).filter(value -> value % 2 != 0).sum();
      stringBuilder.append("#").append(num).append(" ").append(sum).append("\n");
      num++;
    }
    System.out.println(stringBuilder);
  }
}
