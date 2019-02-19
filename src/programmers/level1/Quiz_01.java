package programmers.level1;

/*
    |--------------------------------------------------------------------------
    | Note. 소수 찾기
    |--------------------------------------------------------------------------
*/
public class Quiz_01 {

  public static void main(String[] args) {
    System.out.println(solution(5));
  }

  public static int solution(int n) {
    boolean check;
    int answer = 0;
    for (int i = 2; i <= n; i++) {
      check = true;
      for (int j = 2; j <= (int) Math.sqrt(i); j++) {
        if (i % j == 0) {
          check = false;
          break;
        }
      }
      if (check) {
        answer++;
      }
    }
    return answer;
  }
}
