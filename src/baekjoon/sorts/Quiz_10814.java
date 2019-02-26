package baekjoon.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. 나이순 정렬
    |--------------------------------------------------------------------------
*/
public class Quiz_10814 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    ArrayList<Human> list = new ArrayList<>();

    while (t-- > 0) {
      int age = scanner.nextInt();
      String name = scanner.nextLine();
      list.add(new Human(age, name));
    }
    Collections.sort(list, new Comparator<Human>() {
      @Override
      public int compare(Human o1, Human o2) {
        if (o1.age == o2.age) {
          return 0;
        } else {
          return Integer.compare(o1.age, o2.age);
        }
      }
    });

    for (Human result : list) {
      System.out.println(result.age + "" + result.name);
    }
  }

  static class Human {

    int age;
    String name;

    public Human(int age, String name) {
      this.age = age;
      this.name = name;
    }
  }
}

