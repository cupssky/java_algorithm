package doit.chap05;

public class Queen {

  static int[] map = new int[8];

  public static void main(String[] args) {
    set(0);
  }

  private static void set(int i) {
    for (int j = 0; j < 8; j++) {
      map[i] = j;
      if (i == 7) {
        print();
      } else {
        set(i + 1);
      }
    }
  }

  static void print() {
    for (int i = 0; i < 8; i++) {
      System.out.print(map[i] + " ");
    }
    System.out.println();
  }
}
