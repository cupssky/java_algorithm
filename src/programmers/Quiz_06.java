package programmers;

import java.util.ArrayList;

public class Quiz_06 {

  public static void main(String[] args) {
    int[] arr = {4, 4, 4, 3, 3};
    ArrayList<Integer> arrayList = new ArrayList<>();
    int[] answer = {};
    int pre = 10;

    for (int value : arr) {
      if (value != pre) {
        arrayList.add(value);
      }
      pre = value;
    }

    answer = new int[arrayList.size()];
    
    for (int i = 0; i < answer.length; i++) {
      answer[i] = arrayList.get(i).intValue();
      System.out.print(answer[i] + " ");
    }

  }
}
