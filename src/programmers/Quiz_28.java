package programmers;

//제곱근 판별
public class Quiz_28 {

  public static void main(String[] args) {
    System.out.print(solution(8));
  }

  public static long solution(long n) {
    if (n >= 1) {
      long answer = (long) Math.sqrt(n);
      return Math.pow(answer, 2) != n ? -1 : (long) Math.pow(answer + 1, 2);
    } else {
      return -1;
    }
  }
}
