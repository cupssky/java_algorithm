package programmers;

//약수의 합
public class Quiz_18 {

  public static void main(String[] args) {
    System.out.print(solution(12));
  }

  private static int solution(int n) {
    int answer = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        answer += i;
      }
    }
    return answer + n;
  }
}
