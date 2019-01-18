package doit.chap04;

import doit.chap04.IntQueue.OverflowIntQueueException;

public class IntStack {

  private int max;
  private int ptr;
  private int[] stk;

  public IntStack(int capacity) {
    this.ptr = 0;
    this.max = capacity;
    try {
      stk = new int[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }

  public int push(int x) throws OverflowIntQueueException {
    if (ptr >= max) {
      throw new OverflowIntStackException();
    } else {
      return stk[ptr++] = x;
    }
  }

  public int pop(int x) throws EmptyIntStackException {
    if (ptr <= 0) {
      throw new EmptyIntStackException();
    } else {
      return stk[--ptr];
    }
  }

  public int peek() throws EmptyIntStackException {
    if (ptr <= 0) {
      throw new EmptyIntStackException();
    } else {
      return stk[max - 1];
    }
  }

  public int indexOf(int x) {
    for (int i = ptr - 1; i >= 0; i--) {
      if (stk[i] == x) {
        return i;
      }
    }
    return -1;
  }

  public void clear() {
    ptr = 0;
  }

  public int capacity() {
    return max;
  }

  public int size() {
    return ptr;
  }

  public boolean isEmpty() {
    return ptr <= 0;
  }

  public boolean isFull() {
    return ptr >= max;
  }

  public void dump() {
    if (ptr <= 0) {

    } else {
      for (int i = 0; i < ptr; i++) {
        System.out.print(stk[i] + " ");
      }
    }
  }

  public static class EmptyIntStackException extends RuntimeException {

    public EmptyIntStackException() {
    }
  }

  public static class OverflowIntStackException extends RuntimeException {

    public OverflowIntStackException() {
    }
  }
}
