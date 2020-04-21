package com.java8.function;

import java.util.function.Function;

class Student {
  String name;

  Integer marks;

  Student(String name, Integer marks) {
    this.name = name;
    this.marks = marks;
  }
}

public class FunctionGradeExample {
  public static void main(String[] args) {
    Function<Student, String> function = s -> {
      return ((s.marks >= 80) ?
          "A[Distinction]" :
          (s.marks >= 60) ?
              "B[First Class]" :
              (s.marks >= 50) ?
                  "C[Second Class]" :
                  (s.marks >= 35) ? "D" + "[Third Class]" : "E[Fail]");
    };

    Student[] students = { new Student("Rohan", 90), new Student("Rahul", 80),
        new Student("Pratik", 70) };
    for (Student student : students) {
      System.out.println(function.apply(student));
    }
  }

  ;
}
