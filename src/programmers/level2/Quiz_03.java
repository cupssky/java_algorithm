package programmers.level2;

import java.util.Scanner;

// 피보나치 수
public class Quiz_03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(solution(scanner.nextInt()));
  }

  public static int solution(int n) {
    int[] d = new int[n + 1];
    d[0] = 0;
    d[1] = 1;
    d[2] = 1;
    for (int i = 3; i <= n; i++) {
      d[i] = d[i - 1] + d[i - 2];
    }
    return d[n];
  }
}
