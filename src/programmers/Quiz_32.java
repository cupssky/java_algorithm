package programmers;

import java.util.ArrayList;
import java.util.List;

public class Quiz_32 {

  public static void main(String[] args) {
    int[] arr = {1, 1, 3, 3, 0, 1, 1};
    System.out.print(solution(arr));
  }

  public static int[] solution(int[] arr) {
    int[] answer = {};
    List<Integer> list = new ArrayList<>();
    int temp = -1;

    for (int i = 0; i < arr.length; i++) {
      if (temp == arr[i]) {
        continue;
      } else {
        list.add(arr[i]);
        temp = arr[i];
      }
    }

    answer = new int[list.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i);
    }

    return answer;
  }
}
