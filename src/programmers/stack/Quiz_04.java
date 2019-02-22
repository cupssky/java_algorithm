package programmers.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Quiz_04 {

  public static void main(String[] args) {
    int[] progresses = {93, 30, 55};
    int[] speeds = {1, 30, 5};
    System.out.print(solution(progresses, speeds));
  }

  public static int[] solution(int[] progresses, int[] speeds) {
    ArrayList<Integer> list = new ArrayList<>();

    final int success = 100;
    int count = 0;

    for (int i = 0; i < progresses.length; i++) {
      int result = success - progresses[i];
      while (result > 0) {
        result -= speeds[i];
        count++;
      }
      list.add(count);
      count = 0;
    }

    int value = 1;
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        value++;
      } else {
        queue.offer(value);
        value = 1;
      }
    }
    queue.offer(1);

    int[] answer = new int[queue.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = queue.remove();
    }
    return answer;
  }
}
