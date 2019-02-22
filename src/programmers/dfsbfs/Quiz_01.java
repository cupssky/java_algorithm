package programmers.dfsbfs;

/*
    |--------------------------------------------------------------------------
    | Note. 타겟넘버
    |--------------------------------------------------------------------------
*/
public class Quiz_01 {

  private static int ANSWER = 0;

  public static void main(String[] args) {
    int[] numbers = {1, 1, 1, 1, 1};
    int target = 3;
    System.out.print(solution(numbers, target));
  }

  public static int solution(int[] numbers, int target) {
    int answer = 0;
    dfs(numbers, target, 0);
    answer = ANSWER;
    return answer;
  }

  private static void dfs(int[] numbers, int target, int k) {
    if (k == numbers.length) {
      int sum = 0;
      for (int value : numbers) {
        sum += value;
      }
      if (sum == target) {
        ANSWER++;
      }
      return;
    } else {
      numbers[k] *= 1;
      dfs(numbers, target, k + 1);
      numbers[k] *= -1;
      dfs(numbers, target, k + 1);
    }
  }
}
