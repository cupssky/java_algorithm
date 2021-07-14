package programmers.level1;

import java.util.ArrayList;
import java.util.List;

/*
    |--------------------------------------------------------------------------
    | Note. 두개 뽑아서 더하기
    |--------------------------------------------------------------------------
*/
public class Quiz_07 {

  public static void main(String[] args) {
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}};
//, {4, 4, 1}, {1, 7, 3}
    solution(array, commands);
  }

  public static int[] solution(int[] array, int[][] commands) {
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < commands.length; i++) {
      List<Integer> commandKeyList = new ArrayList<>();

      for (int j = 0; j < commands[i].length; j++) {
        commandKeyList.add(commands[i][j]);
      }

      int start = commandKeyList.get(0) - 1;
      int end = commandKeyList.get(1) - 1;
      int searchKey = commandKeyList.get(2) - 1;
      //System.out.println(start + "::" + end + "::" + searchKey);

      List<Integer> searchList = new ArrayList<>();

      if (start == end) {
          searchList.add(array[start]);
      }
      else {
        for (int v = start; v <= end; v++) {
          searchList.add(array[v]);
        }
        searchList.sort(Integer::compareTo);
      }

      result.add(searchList.get(searchKey));
    }
    int [] answer = new int[result.size()];
    int count = 0;
    for (int value : result) {
      answer[count++] = value;
    }

    return answer;
  }
}
