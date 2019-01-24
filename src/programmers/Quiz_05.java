package programmers;

//문자열 숫자로 변환하기
public class Quiz_05 {

  public static void main(String[] args) {
    String s = "+1234";
    int an = Math.abs(Integer.valueOf(s));
    System.out.print(an);
  }
}
