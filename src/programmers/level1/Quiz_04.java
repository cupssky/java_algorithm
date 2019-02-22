package programmers.level1;

/*
    |--------------------------------------------------------------------------
    | Note. 이상한 문자 만들기
    |--------------------------------------------------------------------------
*/
public class Quiz_04 {

  public static void main(String[] args) {
    System.out.print(solution("try hello world"));
  }

  public static String solution(String s) {
    String answer = "";
    int cnt = 0;
    String[] array = s.split("");

    for (String ss : array) {
      cnt = ss.contains(" ") ? 0 : cnt + 1;
      answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
    }
    return answer;
  }
}
