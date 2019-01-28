package programmers;

//하샤드 수
public class Quiz_26 {

  public static void main(String[] args) {
    solution(10);
  }

  public static boolean solution(int x) {

    String[] value = String.valueOf(x).split("");
    int sum = 0;
    for (int i = 0; i < value.length; i++) {
      sum += Integer.parseInt(value[i]);
    }

    return x % sum == 0 ? true : false;
  }
}
