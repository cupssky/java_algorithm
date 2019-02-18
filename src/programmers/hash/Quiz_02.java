package programmers.hash;

import java.util.HashMap;

/*
    |--------------------------------------------------------------------------
    | Note. 전화번호 목록
    |--------------------------------------------------------------------------
*/
public class Quiz_02 {

  public static void main(String[] args) {
    String[] phone_book = {"119", "97674223", "1195524421"};
    System.out.print(solution(phone_book));
  }

  public static boolean solution(String[] phone_book) {
    boolean answer = true;
    HashMap<String, String> map = new HashMap<>();

    for (String value : phone_book) {
      map.put(value, value);
    }
    
    return answer;
  }
}
