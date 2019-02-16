package programmers.level2;

//숫자의 표현
public class Quiz_07 {

  public static void main(String[] args) {
    System.out.println(solution(15));

  }

  public static int solution(int n) {
    int answer = 0;
    int check = n;
    int range = n / 2 + 1;

    for (int i = 1; i <= range; i++) {
      int sum = 0;
      for (int j = i; j <= range; j++) {
        sum += j;
        if (check < sum) {
          break;
        }
        if (check == sum) {
          answer++;
        }
      }
    }
    answer += 1;
    return answer;
  }
// 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리가 있습니다. ─ 박동규 2018.2.7 20:51
//  public int expressions(int num) {
//    int answer = 0;
//    for (int i = 1; i <= num; i += 2) {
//      if (num % i == 0) {
//        answer++;
//      }
//    }
//    return answer;
//  }
}


