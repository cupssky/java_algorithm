package doit.chap03;

public class GenericClassTester {

  public static void main(String[] args) {
    GenericClass<String> s = new GenericClass<>("ABC");
    GenericClass<Integer> n = new GenericClass<>(1234);
    System.out.println(s.getXyz());
    System.out.println(n.getXyz());

  }

  static class GenericClass<T> {

    private T xyz;

    GenericClass(T t) {
      this.xyz = t;
    }

    T getXyz() {
      return xyz;
    }
  }
}
