package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEvenOdd {
  public static void main(String[] args) {
    List<Integer> oddEven = new ArrayList<>();
    oddEven.add(5);
    oddEven.add(10);
    oddEven.add(15);
    oddEven.add(20);
    oddEven.add(25);
    oddEven.add(30);
    List<Integer> evenNumbers = oddEven.stream().filter(i -> i % 2 == 0)
        .collect(Collectors.toList());
    evenNumbers.forEach(integer -> System.out.println(integer));
  }
}
