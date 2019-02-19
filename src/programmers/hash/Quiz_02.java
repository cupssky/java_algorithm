package programmers.hash;

import java.util.Arrays;

/*
    |--------------------------------------------------------------------------
    | Note. 전화번호 목록
    |--------------------------------------------------------------------------
*/
public class Quiz_02 {

  public static void main(String[] args) {
    String[] phone_book = {"113", "12340", "123440", "12345", "98346"};
    System.out.print(solution(phone_book));
  }

  public static boolean solution(String[] phone_book) {
    Arrays.sort(phone_book);
    for (int i = 1; i < phone_book.length; i++) {
      if (phone_book[i].startsWith(phone_book[i - 1])) {
        return false;
      }
    }
    return true;
  }
}
