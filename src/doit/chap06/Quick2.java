package doit.chap06;

import java.util.Scanner;
import java.util.Stack;

public class Quick2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    quick(a, 0, n - 1);
    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }

  static void quick(int[] a, int left, int right) {
    Stack<Integer> lStack = new Stack<>();
    Stack<Integer> rStack = new Stack<>();

    lStack.push(left);
    rStack.push(right);

    while (lStack.isEmpty() != true) {
      int pl = left = lStack.pop();
      int pr = right = rStack.pop();
      int x = a[(left + right) / 2];

      do {
        while (a[pl] < x) {
          pl++;
        }
        while (a[pr] > x) {
          pr--;
        }
        if (pl <= pr) {
          int temp = a[pl];
          a[pl] = a[pr];
          a[pr] = temp;
          pl++;
          pr--;
        }
      } while (pl <= pr);
      if (left < pr) {
        lStack.push(left);
        rStack.push(pr);
      }
      if (pl < right) {
        lStack.push(pl);
        rStack.push(right);
      }
    }
  }
}
