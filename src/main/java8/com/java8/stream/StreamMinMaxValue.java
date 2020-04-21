package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMinMaxValue {
  public static void main(String[] args) {
    List<Integer> marks = new ArrayList<>();
    marks.add(25);
    marks.add(35);
    marks.add(20);
    marks.add(40);
    marks.add(45);
    Integer minValue = marks.stream().min((i1, i2) -> i1.compareTo(i2)).get();
    System.out.println("MinValue ::" + minValue);
    Integer maxValue = marks.stream().max((i1, i2) -> i1.compareTo(i2)).get();
    System.out.println("MaxValue ::" + maxValue);
  }
}
