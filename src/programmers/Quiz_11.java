package programmers;

//수박수박수박
public class Quiz_11 {

  public static void main(String[] args) {
    System.out.print(solution(3));
  }

  public static String solution(int n) {
    return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
  }
}
