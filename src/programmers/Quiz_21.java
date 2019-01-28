package programmers;

//자릿수 더하기
public class Quiz_21 {

  public static void main(String[] args) {

  }

  private static int solution(int n) {
    int answer = 0;
    String[] array = String.valueOf(n).split("");
    for (String s : array) {
      answer += Integer.parseInt(s);
    }
    return answer;
  }
}
