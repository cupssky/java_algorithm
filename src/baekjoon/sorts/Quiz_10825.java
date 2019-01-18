package baekjoon.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz_10825 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    ArrayList<Student> studentList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String name = scanner.next();
      int kor = scanner.nextInt();
      int eng = scanner.nextInt();
      int math = scanner.nextInt();
      Student student = new Student(name, kor, eng, math);
      studentList.add(student);
    }
    Collections.sort(studentList);

    for (Student s : studentList) {
      System.out.println(s.name);
    }
  }
}

class Student implements Comparable<Student> {

  String name;
  int kor;
  int eng;
  int math;

  public Student(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  //  국어 점수가 감소하는 순서로
//  국어 점수가 같으면 영어 점수가 증가하는 순서로
//  국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
//  모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
  @Override
  public int compareTo(Student o) {
    if (this.kor == o.kor) {
      if (this.eng == o.eng) {
        if (this.math == o.math) {
          return this.name.compareTo(o.name);
        }
        return Integer.compare(o.math, this.math);
      }
      return Integer.compare(this.eng, o.eng);
    }
    return Integer.compare(o.kor, this.kor);
  }
}
