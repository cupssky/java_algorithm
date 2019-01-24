package programmers;

//두 정수 사이의 합
public class Quiz_04 {

  public long solution(int a, int b) {
    return sumAtoB(Math.min(a, b), Math.max(b, a));
  }

  private long sumAtoB(long a, long b) {
    return (b - a + 1) * (a + b) / 2;
  }
}
