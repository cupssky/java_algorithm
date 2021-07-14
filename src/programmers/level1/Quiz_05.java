package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    |--------------------------------------------------------------------------
    | Note. 두개 뽑아서 더하기
    |--------------------------------------------------------------------------
*/
public class Quiz_05 {

  public static void main(String[] args) {
    int[] numbers = {2,1,3,4,1};
    solution(numbers);
  }

  public static int[] solution(int[] numbers) {
    Set<Integer> setter = new HashSet<>();

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        setter.add(numbers[i] + numbers[j]);
      }
    }

    Iterator<Integer> iterator = setter.iterator();

    int[] answer = new int[setter.size()];
    int index = 0;

    while (iterator.hasNext()) {
      answer[index++] = iterator.next();
    }

    Arrays.sort(answer);

    /*이게 더 깔끔함 Set도 Stream이 됩니다.*/
    //set.stream().sorted().mapToInt(Integer::intValue).toArray();
    return answer;
  }
}
