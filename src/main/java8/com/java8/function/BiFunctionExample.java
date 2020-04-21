package com.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class EmployeeData {
  int empNo;

  String empName;

  EmployeeData(int empNo, String empName) {
    this.empNo = empNo;
    this.empName = empName;
  }
}

public class BiFunctionExample {
  public static void main(String[] args) {
    List<EmployeeData> employeeDataList = new ArrayList<>();
    BiFunction<Integer, String, EmployeeData> biFunction = (empNo, empName) -> {
      return new EmployeeData(empNo, empName);
    };
    employeeDataList.add(biFunction.apply(101, "Rohan"));
    employeeDataList.add(biFunction.apply(102, "Sumit"));
    employeeDataList.add(biFunction.apply(103, "Rakesh"));
    for (EmployeeData employeeData : employeeDataList) {
      System.out.println(employeeData.empNo + " " + employeeData.empName);
    }
  }
}
