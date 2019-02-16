package programmers.level2;

//다음 큰 숫자, BitCount 함수 참조
public class Quiz_08 {

  public static void main(String[] args) {
    System.out.println(solution(15));
  }

  private static int solution(int n) {
    int countOne = 0;
    for (char c : Integer.toBinaryString(n).toCharArray()) {
      if (c == '1') {
        countOne++;
      }
    }
    while (true) {
      n++;
      int searchCount = 0;
      for (char c : Integer.toBinaryString(n).toCharArray()) {
        if (c == '1') {
          searchCount++;
        }
      }
      if (searchCount == countOne) {
        break;
      }
    }
    return n;
  }
}
