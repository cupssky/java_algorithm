package programmers;

import java.util.Arrays;

//K번째 수
public class Quiz_30 {

  public static void main(String[] args) {
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    solution(array, commands);
  }

  public static int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
    int[] temp = {};
    for (int i = 0; i < commands.length; i++) {
      temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]).clone();
      Arrays.sort(temp);
      answer[i] = temp[commands[i][2] - 1];
    }
    return answer;
  }
}
