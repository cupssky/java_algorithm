package programmers.hash;

import java.util.HashMap;

/*
    |--------------------------------------------------------------------------
    | Note. 위장
    | 1. containKey 함수
    | 2. 각종류별 입을수 있는수 (A+1) * (B+1) -1
    |--------------------------------------------------------------------------
*/
public class Quiz_03 {

  public static void main(String[] args) {
    String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
        {"green_turban", "headgear"}};
    solution(clothes);
  }

  public static int solution(String[][] clothes) {
    int answer = 1;
    HashMap<String, Integer> map = new HashMap<>();

    for (int i = 0; i < clothes.length; i++) {
      if (map.containsKey(clothes[i][1])) {
        map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
      } else {
        map.put(clothes[i][1], 1);
      }
    }
    for (int value : map.values()) {
      answer *= (value + 1);
    }
    answer -= 1;
    return answer;
  }
}
