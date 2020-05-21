package com.java8.lambdafunctional;

@FunctionalInterface
interface AddNumbers {
  public void add(int a, int b);
}

public class FunctionalInterfaceAdd {
  public static void main(String[] args) {
    AddNumbers an = (a, b) -> System.out.println(a + b);
    an.add(10, 20);
  }
}
