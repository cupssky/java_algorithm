package labs.level3.simple1;

import java.util.Scanner;

//상자 색칠
public class Quiz_04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] colorCount = new int[1001];
    int one = 0;
    int two = 0;

    for (int i = 0; i < n; i++) {
      colorCount[scanner.nextInt()]++;
    }

    for (int i = 0; i < colorCount.length; i++) {
      if (colorCount[i] == 1) {
        one++;
      } else if (colorCount[i] >= 2) {
        two++;
      }
    }

    if (two >= 3) {
      System.out.println("YES");
    } else if (two == 2 && one >= 2) {
      System.out.println("YES");
    } else if (two == 1 && one >= 4) {
      System.out.println("YES");
    } else if (two == 0 && one >= 6) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
