package com.java8.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamToArray {
  public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(10);
    integers.add(20);
    integers.add(30);
    integers.add(40);
    Integer[] integers1 = integers.stream().toArray(Integer[]::new);
    for (Integer integer : integers1) {
      System.out.println("Elements::" + integer);
    }
    Stream.of(integers1).forEach(System.out::println);
  }
}
