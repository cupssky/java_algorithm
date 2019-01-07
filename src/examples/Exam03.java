package examples;

//JVM이 컴파일할 때 java Exam03 Class를 어디서 찾을까? -> Class Path에서 찾는다.
//클래스를 찾아서 읽어들인 클래스 정보가 메모리에 올라감 (그 역활 하는게 시스템클래스로더)
//클래스로더가 읽어들일 때 static한 것은 메모리에 별도로 올린다.
//static한 변수를 초기화해주는건 static 블럭 , static이 붙어있는 애들은 인스턴스르 만들지 않아도 실행 가능
//이러한 해당정보가 재시작 전까지는 사라지지 않는다.
public class Exam03 {

  static {
    System.out.println("static");
  }

  public static void main(String[] args) {
    System.out.println("main");
    //레퍼런스타입 레퍼런스변수
    MyBean2 m = new MyBean2(); //클래스 Path에서 찾는다.
    m.print();
  }
}

class MyBean2 {

  static {
    System.out.println("MyBean2 static block");
  }

  public MyBean2() {
    System.out.println("MyBean2()");
  }

  public void print() {
    System.out.println("print");
  }
}