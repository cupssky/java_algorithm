package programmers;

//윤년
public class Quiz_31 {

  public static void main(String[] args) {
    solution(5, 24);
  }

  public static String solution(int a, int b) {
    int sum = 0;
    String w[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    int m[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    for (int i = 0; i < a - 1; i++) {
      sum += m[i];
    }

    sum += b - 1;
    String answer = w[sum % 7];

    return answer;
  }
}
