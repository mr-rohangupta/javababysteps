package com.java8.lambdafunctional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
  int empNo;

  String name;

  public Employee(int empNo, String name) {
    this.empNo = empNo;
    this.name = name;
  }

  @Override
  public String toString() {
    return name + ":" + empNo;
  }
}

public class MyEmployeeComparator {
  public static void main(String[] args) {
    List<Employee> empList = new ArrayList<>();
    empList.add(new Employee(1234, "Rohan"));
    empList.add(new Employee(2345, "Sohan"));
    empList.add(new Employee(3234, "Mohan"));
    empList.add(new Employee(4234, "Ravi"));
    empList.add(new Employee(5234, "Rahul"));
    System.out.println("Employee before sort" + empList);
    Collections
        .sort(empList, (I1, I2) -> (I1.empNo < I2.empNo) ? -1 : (I1.empNo > I2.empNo) ? 1 : 0);
    System.out.println("Employee after sort" + empList);
  }
}
