package labs.level5.number;

import java.util.Scanner;

//street tree
public class Quiz_09 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int[] distance = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }
    for (int i = 0; i <= n - 2; i++) {
      distance[i] = array[i + 1] - array[i];
    }

    for (int i = 0; i <= n - 2; i++) {
      distance[i + 1] = gcd(distance[i], distance[i + 1]);
    }

    int interval = distance[n - 2];
    int streetTree = ((array[n - 1] - array[0]) / interval) - (array.length - 1);
    System.out.println(streetTree);
  }

  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }
}

