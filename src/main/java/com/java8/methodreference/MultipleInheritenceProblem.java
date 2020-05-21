package com.java8.methodreference;

interface Left {
  default void m1() {
    System.out.println("Interface A");
  }
}

interface Right {
  default void m1() {
    System.out.println("Interface B");
  }
}

public class MultipleInheritenceProblem implements Left, Right {
  public void m1() {
    Left.super.m1();
    System.out.println("Our own left right method");
  }

  public static void main(String[] args) {
    MultipleInheritenceProblem multipleInheritenceProblem = new MultipleInheritenceProblem();
    multipleInheritenceProblem.m1();
  }
}
