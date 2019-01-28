package programmers;

import java.util.Arrays;

// 예산 다시풀기
public class Quiz_29 {

  public static void main(String[] args) {
    int[] d = {2, 2, 4, 5};
    System.out.print(solution(d, 10));
  }

  public static int solution(int[] d, int budget) {
    int answer = 0;
    Arrays.sort(d);
    for (int i = 0; i < d.length; i++) {
      budget -= d[i];
      if (budget < 0) {
        break;
      }
      answer++;
    }
    return answer;
  }
}
