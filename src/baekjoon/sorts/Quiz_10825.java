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

  @Override
  public int compareTo(Student o) {
    if (this.kor == o.kor) {
      return Integer.compare(this.eng, o.eng);
    } else if (this.kor == this.eng) {
      return Integer.compare(o.math, this.math);
    } else {
      return Integer.compare(o.kor, this.kor);
    }
  }
}
