package doit.chap04.practice;

public class TwoStack {

  private int max;
  private int ptrA;
  private int ptrB;
  private int[] stk;

//  public enum AorB {
//    StackA, StackB
//  }
//
//  ;

  public TwoStack(int capacity) {
    try {
      
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }

  public class EmptyException extends RuntimeException {

    public EmptyException() {
    }
  }

  public class OverFlowException extends RuntimeException {

    public OverFlowException() {
    }
  }

}
