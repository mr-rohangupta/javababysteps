package com.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class MyEmployee {
  String name;

  double salary;

  MyEmployee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String toString() {
    return String.valueOf(salary);
  }
}

public class CustomPredicate {
  public static void main(String[] args) {
    List<MyEmployee> myEmployees = new ArrayList<>();
    myEmployees.add(new MyEmployee("Rohan", 10000));
    myEmployees.add(new MyEmployee("Mohit", 5000));
    myEmployees.add(new MyEmployee("Rajiv", 4000));
    myEmployees.add(new MyEmployee("Rakesh", 5000));
    Predicate<MyEmployee> employeePredicate = employee -> employee.salary > 4000;
    myEmployees.forEach(System.out::println);
  }
}
