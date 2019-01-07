package baekjoon.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz_10814 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    ArrayList<Member> arrayList = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int age = scanner.nextInt();
      String name = scanner.next();
      Member member = new Member(age, name);
      arrayList.add(member);
    }

    Collections.sort(arrayList);

    for (Member m : arrayList) {
      System.out.println(m.age + " " + m.name);
    }
  }

}

class Member implements Comparable<Member> {

  String name;
  int age;

  public Member(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public int compareTo(Member o) {
    return Integer.compare(this.age, o.age);
  }
}
