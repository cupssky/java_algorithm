package examples;

import java.lang.reflect.Method;

public class Exam02 {

  public static void main(String[] args)
      throws Exception {
    //숫자값을 하나 읽어들여서 숫자값이 100이면 Action100클래스를 인스턴스로 만들고 run()
    //메소드를 호출해라
    //Object obj = new Action1(); //조상과 자손 관계 ?
    Object obj1 = new Action1();
    ((Action1) obj1).run();

    int num = 1;
    //자바 리플렉션을 이용하여 class명과 메소드명을 받아들여서 실행,
    Class clas = Class.forName("examples.Action" + num); // Class.forAname 클래스 로더
    System.out.println(clas.getName());
    Object obj = clas.newInstance();
    //메소드가 실행할려면 인스턴스가 있어야함.
    Method runMethod = clas.getMethod("run", null);
    runMethod.invoke(obj, null);

    //패키지가 있는것은 리플렉션이라고 함
//    Method[] methods = clas.getMethods();
//    for (Method m : methods) {
//      System.out.println(m.getName());
//    }
  }
}

class Action1 {

  static {
    System.out.println("static");
  }

  public void run() {
    System.out.println("action 1");
  }
}

class Action2 {

  public void run() {
    System.out.println("action 2");
  }
}

