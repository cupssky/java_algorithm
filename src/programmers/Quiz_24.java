package programmers;

//자연수 뒤집어 배열로 만들기
public class Quiz_24 {

  public static void main(String[] args) {
    solution(12345);
  }

  public static int[] solution(long n) {
    String value = String.valueOf(n);
    int len = value.length();
    int[] answer = new int[len];

    for (int i = len - 1; i >= 0; i--) {
      answer[len - 1 - i] = Integer.parseInt(String.valueOf(value.charAt(i)));
    }
    return answer;
  }

  public static int[] solution2(long n) {
    String a = "" + n;
    int[] answer = new int[a.length()];
    int cnt = 0;

    while (n > 0) {
      answer[cnt] = (int) (n % 10);
      n /= 10;
      System.out.println(n);
      cnt++;
    }
    return answer;
  }
}
