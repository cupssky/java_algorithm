package labs.basic;

import java.util.Scanner;

public class Quiz_26 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[10];
    int[] inputA = new int[10];
    int[] inputB = new int[10];
    int winA = 0;
    int winB = 0;
    int draw = 0;

    for (int i = 0; i < 10; i++) {
      inputA[i] = scanner.nextInt();
    }

    for (int i = 0; i < 10; i++) {
      inputB[i] = scanner.nextInt();
    }

    for (int i = 0; i < array.length; i++) {
      if (inputA[i] == inputB[i]) {
        draw++;
      } else if (inputA[i] > inputB[i]) {
        winA++;
      } else if (inputA[i] < inputB[i]) {
        winB++;
      }
    }

    int[] result = new int[]{winA, winB, draw};
    int max = 0;

    for (int i = 0; i < result.length; i++) {
      if (max < result[i]) {
        max = result[i];
      }
    }

    if (result[0] > result[1]) {
      System.out.print("A");
    } else if (result[0] < result[1]) {
      System.out.print("B");
    } else {
      System.out.print("D");
    }

  }
}
