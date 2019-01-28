package programmers;

//p와 y의 개수
public class Quiz_09 {

  public static void main(String[] args) {
    System.out.println(solution("pPoooY"));

  }

  private static boolean solution(String s) {
    s.toUpperCase();

    return s.chars().filter(value -> 'P' == value).count() == s.chars()
        .filter(value -> 'Y' == value).count();
  }
}
