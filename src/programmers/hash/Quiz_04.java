package programmers.hash;

import java.util.HashMap;

public class Quiz_04 {

  public static void main(String[] args) {
    String[] genres = {"classic", "pop", "classic", "classic", "pop"};
    int[] plays = {500, 600, 150, 800, 2500};
    solution(genres, plays);
  }

  public static int[] solution(String[] genres, int[] plays) {
    int[] answer = {};
    HashMap<String, Integer> map = new HashMap<>();

    for (int i = 0; i < genres.length; i++) {
      if (map.containsKey(genres[i])) {
        map.put(genres[i], map.get(genres[i]) + plays[i]);
      } else {
        map.put(genres[i], plays[i]);
      }
    }

    return answer;
  }
}
