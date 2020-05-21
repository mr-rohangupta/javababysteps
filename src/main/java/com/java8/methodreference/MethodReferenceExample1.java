package com.java8.methodreference;

interface Addition {
  void sum(int a, int b);
}

public class MethodReferenceExample1 implements Addition {
  public void sum(int a, int b) {
    int c = a + b;
    System.out.println("Addition of numbers::" + c);
  }

  public static void main(String[] args) {
    //Approach 1
    Addition addition = (a, b) -> System.out.println(a + b);
    addition.sum(10, 20);
    System.out.println("The addition is");
    //Approach 2
    MethodReferenceExample1 methodReferenceExample1 = new MethodReferenceExample1();
    Addition addition1 = methodReferenceExample1::sum;
    addition1.sum(10, 20);
  }
}
