package labs.basic;

import java.util.Scanner;

public class Quiz_24 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int value;
    int max = 0;
    int countMax = 0;
    int sum;
    for (int i = 0; i < array.length; i++) {
      int one = scanner.nextInt();
      int two = scanner.nextInt();
      int three = scanner.nextInt();

      if (one == two && two == three && one == three) {
        value = 10000 + one * 1000;
        sum = value;
      } else if (one == two || two == three) {
        value = 1000 + one * 100;
        sum = value;
      } else {
        if (max < one) {
          max = one;
          if (max < two) {
            max = two;
            if (max < three) {
              max = three;
            }
          }
        }
        value = max;
        sum = value;
      }
      array[i] = sum;
    }

    for (int i = 0; i < array.length; i++) {
      if (countMax < array[i]) {
        countMax = array[i];
      }
    }
    System.out.print(countMax);
  }

}
