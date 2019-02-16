package sw.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
    |--------------------------------------------------------------------------
    | Note. 평균값 구하기 (기본)
    |--------------------------------------------------------------------------
*/
public class Quiz_2071 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bufferedReader.readLine());
    StringBuilder stringBuilder = new StringBuilder();
    int num = 1;
    while (t-- > 0) {
      int[] array = new int[10];
      String[] input = bufferedReader.readLine().split(" ");
      for (int i = 0; i < 10; i++) {
        array[i] = Integer.parseInt(input[i]);
      }
      int avg = (int) Math.round(Arrays.stream(array).average().getAsDouble());
      stringBuilder.append("#").append(num).append(" ").append(avg)
          .append("\n");
      num++;
    }
    System.out.println(stringBuilder);
  }
}
