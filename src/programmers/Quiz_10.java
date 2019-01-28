package programmers;

public class Quiz_10 {

  public static void main(String[] args) {
    System.out.print(solution("1234."));
  }

  private static boolean solution(String s) {
    if (s.length() == 4 || s.length() == 6) {
      try {
        Integer.parseInt(s);
        return true;
      } catch (NumberFormatException e) {
        return false;
      }
    } else {
      return false;
    }
  }
}
