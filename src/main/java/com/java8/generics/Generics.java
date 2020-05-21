package com.java8.generics;

public class Generics<T> {
  T t;

  Generics(T t) {
    this.t = t;
  }

  public void show() {
    System.out.println("The type of object is::" + t.getClass().getName());
  }

  public T getT() {
    return t;
  }
}

class Test {
  public static void main(String[] args) {
    Generics<String> stringGenerics = new Generics<>("Rohan");
    stringGenerics.show();
    System.out.println(stringGenerics.getT());

    Generics<Integer> integerGenerics = new Generics<>(10);
    integerGenerics.show();
    System.out.println(integerGenerics.getT());
  }
}
