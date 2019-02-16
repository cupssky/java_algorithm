package programmers.level2;

//최대값 최소값
public class Quiz_04 {

  public static void main(String[] args) {
    String value = "1 2 3 4";
    System.out.println(solution(value));
  }

  public static String solution(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] value = s.split(" ");

    int max = Integer.parseInt(value[0]);
    int min = Integer.parseInt(value[0]);

    for (int i = 1; i < value.length; i++) {
      max = Math.max(max, Integer.parseInt(value[i]));
      min = Math.min(min, Integer.parseInt(value[i]));
    }

    return stringBuilder.append(min + " " + max).toString();
  }
}
