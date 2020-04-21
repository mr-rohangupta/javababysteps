package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCompareTo {
  public static void main(String[] args) {
    List<Integer> marks = new ArrayList<>();
    marks.add(25);
    marks.add(35);
    marks.add(20);
    marks.add(40);
    marks.add(45);
    List<Integer> integers = marks.stream().sorted((i1, i2) -> i2.compareTo(i1))
        .collect(Collectors.toList());
    integers.forEach(System.out::println);
  }
}