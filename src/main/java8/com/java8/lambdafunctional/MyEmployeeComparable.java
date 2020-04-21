package com.java8.lambdafunctional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeMaster {
  int empNo;

  String empName;

  public EmployeeMaster(int empNo, String empName) {
    this.empNo = empNo;
    this.empName = empName;
  }

  public String toString() {
    return empName + ":" + empNo;
  }
}

public class MyEmployeeComparable {
  public static void main(String[] args) {
    List<EmployeeMaster> empList = new ArrayList<>();
    empList.add(new EmployeeMaster(1234, "Rohan"));
    empList.add(new EmployeeMaster(2345, "Sohan"));
    empList.add(new EmployeeMaster(3234, "Mohan"));
    empList.add(new EmployeeMaster(4234, "Jagmohan"));
    empList.add(new EmployeeMaster(5234, "Brijmohan"));
    System.out.println("Employee before sort" + empList);
    Collections.sort(empList, (e1, e2) -> e1.empName.compareTo(e2.empName));
    System.out.println("Employee after sort ::" + empList);
  }
}
