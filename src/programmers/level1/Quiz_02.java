package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

/*
    |--------------------------------------------------------------------------
    | Note. 모의고사
    |--------------------------------------------------------------------------
*/
public class Quiz_02 {

  public static void main(String[] args) {
    int[] answers = {1, 3, 2, 4, 2};
    System.out.print(solution(answers));
  }

  public static int[] solution(int[] answers) {
    int[] one = {1, 2, 3, 4, 5};
    int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[] count = {0, 0, 0};

    ArrayList<Integer> answer = new ArrayList<>();

    for (int i = 0; i < answers.length; i++) {
      if (one[i % 5] == answers[i]) {
        count[0]++;
      }
      if (two[i % 8] == answers[i]) {
        count[1]++;
      }
      if (three[i % 10] == answers[i]) {
        count[2]++;
      }
    }
    int max = Math.max(count[0], Math.max(count[1], count[2]));
    if (max == count[0]) {
      answer.add(1);
    }
    if (max == count[1]) {
      answer.add(2);
    }
    if (max == count[2]) {
      answer.add(3);
    }
    answer.toArray();
    int[] result = new int[answer.size()];
    int cnt = 0;
    for (int value : answer) {
      result[cnt++] = value;
    }
    Arrays.sort(result);
    //list.stream().mapToInt(i->i.intValue()).toArray();
    return result;
  }

}
