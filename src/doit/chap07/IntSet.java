package doit.chap07;

public class IntSet {

  private int max;
  private int num;
  private int[] set;

  public IntSet(int capacity) {
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

  public int indexOf(int num) {
    for (int i = 0; i < num; i++) {
      if (set[i] == num) {
        return i;
      }
    }
    return -1;
  }

  public boolean contains(int num) {
    return (indexOf(num) != -1) ? true : false;
  }

  public boolean add(int num) {
    if (num >= max || contains(num) == true) {
      return false;
    } else {
      set[this.num++] = num;
      return true;
    }
  }

  public boolean remove(int num) {
    int idx;
    if (num <= 0 || (idx = indexOf(num)) == -1) {
      return false;
    } else {
      set[idx] = set[--this.num];
      return true;
    }
  }

  public void copyTo(IntSet s) {
    int num = (s.max < this.num) ? s.max : this.num;
    for (int i = 0; i < num; i++) {
      s.set[i] = set[i];
    }
    s.num = this.num;
  }

  public void copyFrom(IntSet s) {
    int num = (max < s.num) ? max : s.num;
    for (int i = 0; i < num; i++) {
      set[i] = s.set[i];
    }
    this.num = num;
  }

  public boolean equalTo(IntSet s) {
    if (this.num != s.num) {
      return false;
    }
    for (int i = 0; i < num; i++) {
      int j = 0;
      for (; j < s.num; j++) {
        if (set[i] == s.set[j]) {
          break;
        }
      }
      if (j == s.num) {
        return false;
      }
    }
    return true;
  }

  public void unionOf(IntSet s1, IntSet s2) {
    copyFrom(s1);
    for (int i = 0; i < s2.num; i++) {
      add(s2.set[i]);
    }
  }

  public String toString() {
    StringBuffer temp = new StringBuffer("{");
    for (int i = 0; i < num; i++) {
      temp.append(set[i] + " ");
    }
    temp.append("}");
    return temp.toString();


  }
}
