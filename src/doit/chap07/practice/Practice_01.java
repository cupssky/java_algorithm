package doit.chap07.practice;

public class Practice_01 {

  private int max;
  private int num;
  private int[] set;

  public Practice_01(int capacity) {
    num = 0;
    max = capacity;
    try {
      set = new int[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }

  public int capacity() {
    return max;
  }

  public int size() {
    return num;
  }

  public int indexOf(int n) {
    for (int i = 0; i < num; i++) {
      if (set[i] == n) {
        return i;
      }
    }
    return -1;
  }

  public boolean contains(int n) {
    return (indexOf(n) != -1) ? true : false;
  }
  
}
