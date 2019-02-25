package programmers.level2;

import java.util.ArrayList;

public class Quiz_11 {

  public static void main(String[] args) {
    String numbers = "17";
    solution(numbers);
  }

  public static int solution(String numbers) {
    int answer = 0;
    StringBuilder stringBuilder = new StringBuilder();
    ArrayList<Character> list = new ArrayList<>();

    for (char v : numbers.toCharArray()) {
      list.add(v);
    }
    for (int i = 0; i < list.size(); i++) {
      stringBuilder.append(list.get(i));
    }

    //System.out.print(value);
    return answer;
  }
}
