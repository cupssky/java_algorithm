package programmers.level2;

import java.util.Arrays;

public class Quiz_02 {

  public static void main(String[] args) {
    int[] citations = {3, 0, 6, 1, 5};
    solution(citations);
  }

  public static int solution(int[] citations) {
    int answer = 0;
    Arrays.sort(citations);
    answer = citations[citations.length / 2];
    return answer;
  }
}
