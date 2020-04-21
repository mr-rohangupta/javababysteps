package com.java8.function;

import java.util.function.Function;

public class FunctionExample {
  public static void main(String[] args) {
    Function<Integer, Integer> square = i -> i * i;
    System.out.println(square.apply(10));
  }
}
