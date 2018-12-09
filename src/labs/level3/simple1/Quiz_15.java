package labs.level3.simple1;

import java.util.Scanner;

//대표값
public class Quiz_15 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[10];
    int[] count = new int[1002];
    int sum = 0;
    int max = 0;
    int idx = 0;
    for (int i = 0; i < 10; i++) {
      array[i] = scanner.nextInt();
      sum += array[i];
      count[array[i]]++;
    }
    for (int i = 10; i < count.length; i++) {
      if (max < count[i]) {
        max = count[i];
        idx = i;
      }
    }
    System.out.println(sum / 10);
    System.out.println(idx);
  }
}
