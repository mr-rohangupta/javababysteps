package com.java8.constructorreference;

import java.util.stream.Stream;

class Sample {
  Sample(String s) {
    System.out.println("String Argument " + s);
  }
}

interface Interf {
  public Sample get(String s);
}

public class ConstructorReference {
  public static void main(String[] args) {
    Stream streams;
    Interf interf = Sample::new;
    Sample s1 = interf.get("Rohan");
    Sample s2 = interf.get("Rakesh");
  }
}
