package examples;

public class Exam01 {

  // 프로그램 시작점 (메인메소드)
  public static void main(String[] args) {
    //앞에 레퍼런스타입, new 생성자
    //MyBean bean = new MyBean();
    Parent p = new Child();
    System.out.println(p.i);
    p.print();
  }
}

//오버라이딩 한다고 부모껄 바꿔버리지 않는다. 오버라이딩은 교체하는것이 아니라 중복
//메소드가 오버라이딩 되면 무조건 자식께 실행된다.
class Parent {

  int i = 5;

  public void print() {
    System.out.println(i);
  }
}

class Child extends Parent {

  int i = 10;

  public void print() {
    System.out.println(i);
  }
}

class MyBean {

}
