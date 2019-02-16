package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz_01 {

  public static void main(String[] args) {
    int[] numbers = {6, 10, 2};
    System.out.println(solution(numbers));
  }

  public static String solution(int[] numbers) {
    List<String> list = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < numbers.length; i++) {
      list.add(String.valueOf(numbers[i]));
    }

    Collections.sort(list, (a, b) -> (b + a).compareTo(a + b));

    if (list.get(0).equals("0")) {
      return "0";
    }

    for (int i = 0; i < list.size(); i++) {
      stringBuilder.append(list.get(i));
    }

    return stringBuilder.toString();
  }
}
