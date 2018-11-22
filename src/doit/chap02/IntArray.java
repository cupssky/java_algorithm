package doit.chap02;

public class IntArray {

  public static void main(String[] args) {
    int[] array = new int[5];
    array[1] = 37;
    array[2] = 51;
    array[4] = array[1] * 2;
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
