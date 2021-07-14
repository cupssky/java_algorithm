package programmers.level1;

import java.util.Arrays;

/*
    |--------------------------------------------------------------------------
    | Note. 이상한 문자 만들기
    |--------------------------------------------------------------------------
*/
public class Quiz_09 {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    System.out.println(solution(arr));
  }

  public static double solution(int[] arr) {
    return Arrays.stream(arr).average().getAsDouble();
  }
}
