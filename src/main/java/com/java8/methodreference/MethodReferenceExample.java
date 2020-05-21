package com.java8.methodreference;

class Test {
  public static void m1() {
    for (int i = 0; i <= 10; i++) {
      System.out.println("Child Thread");
    }
  }

  public int m2() {
    for (int i = 0; i <= 10; i++) {
      System.out.println("Child Thread - 1");
    }
    return 10;
  }
}

public class MethodReferenceExample {
  public static void main(String[] args) {
    Runnable runnable = Test::m1;
    Thread thread = new Thread(runnable);
    thread.start();
    Test test = new Test();
    Runnable runnable1 = test::m2;
  }
}
