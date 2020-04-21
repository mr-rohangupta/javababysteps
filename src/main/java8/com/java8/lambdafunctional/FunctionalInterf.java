package com.java8.lambdafunctional;

@FunctionalInterface
interface Interif {
  public void m1();
}

public class FunctionalInterf {
  public static void main(String[] args) {
    Interif i = () -> System.out.println("Hello Rohan");
    i.m1();
  }
}
