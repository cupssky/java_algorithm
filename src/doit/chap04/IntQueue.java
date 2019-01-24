package doit.chap04;

public class IntQueue {

  private int max;
  private int front;
  private int rear;
  private int num;
  private int[] que;


  public IntQueue(int capacity) {
    num = front = rear = 0;
    try {
      que = new int[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }

  public int enque(int x) throws OverflowIntQueueException {
    if (num >= max) {
      throw new OverflowIntQueueException();
    }
    que[rear++] = x;
    if (rear == max) {
      rear = 0;
    }
    return x;
  }

  public int deque() throws EmptyIntQueueException {
    if (num <= 0) {
      throw new EmptyIntQueueException();
    }
    int x = que[front++];
    num--;
    if (front == max) {
      front = 0;
    }
    return x;
  }

  public int peek() throws EmptyIntQueueException {
    if (num <= 0) {
      throw new EmptyIntQueueException();
    }
    return que[front];
  }

  public int indexOf(int x) {
    for (int i = 0; i < num; i++) {
      int idx = (i + front) % max;
      if (que[idx] == x) {
        return idx;
      }
    }
    return -1;
  }

  public void clear() {
    num = front = rear = 0;
  }

  public int capacity() {
    return max;
  }

  public int size() {
    return num;
  }

  public boolean isEmpty() {
    return num <= 0;
  }

  public boolean isFull() {
    return num >= max;
  }

  public class EmptyIntQueueException extends RuntimeException {

    public EmptyIntQueueException() {
    }
  }

  public class OverflowIntQueueException extends RuntimeException {

    public OverflowIntQueueException() {

    }
  }
}
