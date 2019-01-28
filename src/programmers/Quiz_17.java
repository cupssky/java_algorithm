package programmers;

//핸드폰 번호가리기
public class Quiz_17 {

  public static void main(String[] args) {
    System.out.print(solution("01033334444"));
  }

  private static String solution(String phone_number) {
    char[] c = phone_number.toCharArray();
    for (int i = 0; i < c.length - 4; i++) {
      c[i] = '*';
    }
    return String.valueOf(c);
  }
}
