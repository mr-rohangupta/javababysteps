package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateExample {
  public static void main(String[] args) {
    //Predicate<Integer> p = i -> i % 2 == 0 ? true : false;
    //System.out.println(p.test(4));
    //System.out.println(p.test(5));
    //Predicate<String> stringPredicate = str -> str.length() > 5 ? true : false;
    //System.out.println(stringPredicate.test("Rohan"));
    String[] input = { "Rohan", "Raju", "India", "Srilanka" };
    Predicate<String> predicate = str -> str.length() > 5;
    for (String s : input) {
      if (predicate.test(s)) {
        System.out.println(s);
      }
    }
  }
}
