package doit.chap09;

import java.util.Comparator;
import java.util.Scanner;

public class LinkedListTester {

  static Scanner scanner = new Scanner(System.in);

  enum Menu {
    ADD_FIRST("머리에 노드 삽입"),
    ADD_LAST("꼬리에 노드 삽입"),
    RMV_FIRST("머리에 노드 삭제"),
    RMV_LAST("꼬리에 노드 삭제"),
    CLEAR("모든 노드 삭제"),
    SEARCH_NO("번호로 노드 검색"),
    SEARCH_NAME("이름으로 노드 검색"),
    NEXT("선택노드로 이동"),
    PRINT_CRNT("선택 노드를 출력"),
    DUMP("모든 노드를 출력"),
    TERMINATE("종료");

    private final String message;

    Menu(String string) {
      message = string;
    }

    static Menu MenuAt(int idx) {
      for (Menu m : Menu.values()) {
        if (m.ordinal() == idx) {
          return m;
        }
      }
      return null;
    }

//    static Menu SelectMenu() {
//      int key;
//
//      do {
//        for (Menu m : Menu.values()) {
//          System.out.printf("(%d) %s ", m.ordinal(), m.getMessage());
//          if (m.ordinal() ) {
//
//          }
//        }
//      } while (key < Menu.ADD_FIRST.ordinal() || key > Menu.TERMINATE.ordinal());
//    }

    String getMessage() {
      return message;
    }
  }

  static class Data {

    public static final Comparator<Data> NO_ORDER = new NoOrderComparator();
    static final int NO = 1;
    static final int NAME = 2;
    private Integer no;
    private String name;

    public String toString() {
      return "(" + no + ")" + name;
    }

    void scanData(String guide, int sw) {
      System.out.println(guide + "할 데이터를 입력");

      if ((sw & NO) == NO) {
        System.out.print("번호 : ");
        no = scanner.nextInt();
      }
      if ((sw & NAME) == NAME) {
        System.out.print("이름 : ");
        name = scanner.next();
      }
    }

    private static class NoOrderComparator implements Comparator<Data> {

      @Override
      public int compare(Data d1, Data d2) {
        return (d1.no > d2.no) ? 1 : (d1.no < d2.no) ? -1 : 0;
      }
    }

    private static class NameOrderComparator implements Comparator<Data> {

      @Override
      public int compare(Data d1, Data d2) {
        return d1.name.compareTo(d2.name);
      }
    }
  }
}
