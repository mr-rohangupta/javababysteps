package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateJoining {
  public static void main(String[] args) {
    int[] num = { 0, 5, 10, 15, 20, 25, 30, 35, 40 };
    Predicate<Integer> p1 = i -> i % 2 == 0;
    Predicate<Integer> p2 = i -> i > 10;
    for (int x : num) {
      if (p1.and(p2).test(x)) {
        System.out.println(x);
      }
    }

    for (int x : num) {
      if (p1.or(p2).test(x)) {
        System.out.println(x);
      }
    }

    for (int x : num) {
      if (p1.negate().test(x)) {
        System.out.println(x);
      }
    }
  }
}
