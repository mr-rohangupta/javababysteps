package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {

  public static void main(String[] args) {
    List<Integer> evenList = new ArrayList<>();
    evenList.add(12);
    evenList.add(13);
    evenList.add(2);
    evenList.add(1);
    List<Integer> evenNo = evenList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    evenNo.stream().forEach(System.out::println);
  }
}
