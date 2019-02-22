package programmers.stack;

/*
    |--------------------------------------------------------------------------
    | Note. 주식 가격
    |--------------------------------------------------------------------------
*/
public class Quiz_02 {

  public static void main(String[] args) {
    int[] prices = {498, 501, 470, 489};
    System.out.print(solution(prices));

  }

  public static int[] solution(int[] prices) {
    int len = prices.length;
    int[] answer = new int[len];

    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        if (prices[i] > prices[j] || j == len - 1) {
          answer[i] = j - i;
          break;
        }
      }
    }
    answer[len - 1] = 0;
    return answer;
  }
}
