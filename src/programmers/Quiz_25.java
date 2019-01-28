package programmers;

//콜라츠 추측
public class Quiz_25 {

  public static void main(String[] args) {
    solution(626331);
  }

  public static int solution(int num) {
    int answer = 0;
    while (answer < 450) {
      if (num % 2 == 0) {
        answer++;
        num /= 2;
      } else if (num == 1) {
        break;
      } else {
        answer++;
        num = num * 3 + 1;
      }
    }
    return answer >= 450 ? -1 : answer;
  }
}

