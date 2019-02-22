package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Quiz_10 {

  public static void main(String[] args) {
    int[] prices = {498, 501, 470, 489};
    System.out.print(solution(prices));
  }

  public static int[] solution(int[] prices) {
    Queue<Integer> queue = new LinkedList<>();

    for (int value : prices) {
      queue.add(value);
    }

    int[] answer = new int[queue.size()];

    int idx = 0;
    int count = 0;

    while (!queue.isEmpty()) {
      int x = ((LinkedList<Integer>) queue).getFirst();
      System.out.println(x + "일때");
      for (int i = 0; i < queue.size(); i++) {
        System.out.print(((LinkedList<Integer>) queue).get(i) + " ");
        if (x >= ((LinkedList<Integer>) queue).get(i)) {
          answer[idx] = count;
          queue.remove();
        }
        count++;
      }
      idx++;
      count = 0;
    }

    for (int a : answer) {
      System.out.print(a + " ");
    }

    return answer;
  }
}
