package com.java8.lambdafunctional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    integerList.add(10);
    integerList.add(0);
    integerList.add(12);
    integerList.add(23);
    integerList.add(2);
    System.out.println("Elements Before Sorting ::" + integerList);
    Comparator<Integer> comparator = (I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0;
    Collections.sort(integerList, comparator);
    integerList.stream().forEach(System.out::println);
  }
}
