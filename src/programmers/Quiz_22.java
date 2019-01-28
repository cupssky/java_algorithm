package programmers;

//x만큼 간격이 있는 n개의 숫자
public class Quiz_22 {

  public static void main(String[] args) {
    System.out.print(solution(2, 5));
  }

  public static long[] solution(int x, int n) {
    long[] answer = new long[n];

    answer[0] = x;
    for (int i = 1; i < n; i++) {
      answer[i] = answer[i - 1] + x;
    }
    return answer;
  }
}
