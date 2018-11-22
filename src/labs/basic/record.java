package labs.basic;

import java.util.Scanner;

public class record {

  //7번문제 10번문제 11번 살짝위기 13번위기
  //18, 21, 25, 27
  //22번 문제가 중요한듯
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int score = 0;
    int oneScore = 0;

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
      if (array[i] == 1) {
        score++;
        oneScore += score;
      } else {
        score = 1;
      }
    }

    System.out.print(oneScore);
  }
}
