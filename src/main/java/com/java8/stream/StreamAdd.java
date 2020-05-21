package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAdd {
  public static void main(String[] args) {
    List<Integer> marks = new ArrayList<>();
    marks.add(25);
    marks.add(35);
    marks.add(20);
    marks.add(40);
    marks.add(45);
    final List<Integer> collect = marks.stream().map(mark -> mark + 10)
        .collect(Collectors.toList());
    collect.forEach(System.out::print);
  }
}
