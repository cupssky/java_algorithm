package programmers;

//시저 암호
public class Quiz_19 {

  public static void main(String[] args) {
    System.out.print(solution("AB", 1));
  }

  public static String solution(String s, int n) {
    char[] c = s.toCharArray();
    if (n <= 25) {
      for (int i = 0; i < c.length; i++) {
        if (c[i] == 'z') {
          c[i] = (char) ('a' + n - 1);
        } else if (c[i] == 'Z') {
          c[i] = (char) ('A' + n - 1);
        } else if (c[i] == ' ') {
          continue;
        } else {
          c[i] += n;
        }
      }
    }
    return s.length() <= 8000 ? String.valueOf(c) : "";
  }
}
