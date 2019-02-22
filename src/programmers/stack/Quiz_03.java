package programmers.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Quiz_03 {

  public static void main(String[] args) {
    int bridge_length = 2;
    int weight = 10;
    int[] truck_weights = {7, 4, 5, 6};
    solution(bridge_length, weight, truck_weights);
  }

  public static int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;
    Queue<Integer> bT = new LinkedList<>();
    Queue<Integer> aT = new LinkedList<>();
    int save = 0;
    int count = 0;

    for (int i = 0; i < truck_weights.length; i++) {
      if (save < weight) {
        bT.add(truck_weights[i]);
        save += truck_weights[i];
      }
    }
    return answer;
  }
}
