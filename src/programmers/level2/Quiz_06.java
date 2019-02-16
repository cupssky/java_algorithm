package programmers.level2;

//올바른 괄호
public class Quiz_06 {

  public static void main(String[] args) {
    System.out.println(solution("()()"));
  }

  private static boolean solution(String s) {
    boolean answer = true;
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        count++;
      } else {
        count--;
      }
      if (count <= -1) {
        break;
      }
    }
    if (count != 0) {
      answer = false;
    }

    return answer;
  }
}
