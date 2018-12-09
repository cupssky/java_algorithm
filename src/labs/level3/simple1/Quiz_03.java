package labs.level3.simple1;

import java.util.Scanner;

//검증수
public class Quiz_03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[5];
    int num = 0;
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      array[i] = scanner.nextInt();
    }
    for (int i = 0; i < 5; i++) {
      num = array[i] * array[i];
      sum += num;
      num = 0;
    }
    System.out.println(sum % 10);
  }
}
