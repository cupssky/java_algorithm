package programmers.greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Quiz_01 {

  public static void main(String[] args) {
    int n = 3;
    int[] lost = {3};
    int[] reserve = {1};
    System.out.print(solution(n, lost, reserve));
  }

  public static int solution(int n, int[] lost, int[] reserve) {
    Queue<Integer> list = new LinkedList<>();
    Arrays.sort(lost);
    Arrays.sort(reserve);

    for (int value : lost) {
      list.add(value);
    }

    for (int i = 0; i < reserve.length; i++) {
      for (int j = 0; j < lost.length; j++) {
        if (reserve[i] == lost[j] + 1 || reserve[i] == lost[j] - 1) {
          if (!list.isEmpty()) {
            ((LinkedList<Integer>) list).remove(j);
            break;
          }
        }
      }
    }

    int answer = n - list.size();
    return answer;
  }
}
