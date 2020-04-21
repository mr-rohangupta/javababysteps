package com.java8.consumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Emp {
  String name;

  double salary;

  Emp(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }
}

public class BiConsumerExample {
  public static void main(String[] args) {
    ArrayList<Emp> emps = new ArrayList<>();
    emps.add(new Emp("Rohan", 1000));
    emps.add(new Emp("Rahul", 2000));
    emps.add(new Emp("Sourav", 3000));
    emps.add(new Emp("Isank", 4000));
    BiConsumer<Emp, Double> empDoubleBiConsumer = (e, d) -> e.salary = e.salary + d;
    for (Emp emp : emps) {
      empDoubleBiConsumer.accept(emp, 500.0);
    }
    for (Emp emp : emps) {
      System.out.println(emp.name + " " + emp.salary);
    }
  }
}
