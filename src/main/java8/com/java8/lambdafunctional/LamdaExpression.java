package com.java8.lambdafunctional;

import java.util.function.Function;

public class LamdaExpression {
  public static void main(String[] args) {
    Function<Integer, Integer> f = i -> i * i;
    System.out.println("The Square of 4 is " + f.apply(4));
    System.out.println("The Square of 5 is " + f.apply(5));
  }

  Function<Integer, Integer> f = n -> n * n;
}
