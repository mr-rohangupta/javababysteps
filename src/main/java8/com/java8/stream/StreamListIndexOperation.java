package com.java8.stream;

import com.java8.utils.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListIndexOperation {
    public static void main(String[] args) {
        StreamListIndexOperation streamListIndexOperation = new StreamListIndexOperation();
        List<com.java8.utils.Employee> employeeList = new ArrayList<>();
        employeeList.add(new com.java8.utils.Employee("Male", "Rohan",null));
        employeeList.add(new com.java8.utils.Employee("Female", "Disha",null));
        employeeList.add(new com.java8.utils.Employee("Male", "Nilesh",null));
        employeeList.add(new com.java8.utils.Employee("Male", "Suresh",null));
        System.out.println("The Nth Employee is " + streamListIndexOperation.getNthEmployee(employeeList, 2));
    }

    public com.java8.utils.Employee getNthEmployee(List<Employee> employeeList, int index) {
        return employeeList.stream().filter(employee -> employee.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.toList()).get(index);
    }
}
