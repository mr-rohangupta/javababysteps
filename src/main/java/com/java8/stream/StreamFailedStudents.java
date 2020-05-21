package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamFailedStudents {
  public static void main(String[] args) {
    List<Integer> marks = new ArrayList<>();
    marks.add(25);
    marks.add(35);
    marks.add(20);
    marks.add(40);
    marks.add(45);
    long failedStudents = marks.stream().filter(i -> i <= 35).count();
    System.out.print("Failed Students::" + failedStudents);
  }
}
