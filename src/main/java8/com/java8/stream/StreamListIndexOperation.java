package com.java8.stream;

import com.java8.utils.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamListIndexOperation {
    public static void main(String[] args) {
        StreamListIndexOperation streamListIndexOperation = new StreamListIndexOperation();
        List<com.java8.utils.Employee> employeeList = new ArrayList<>();
        //employeeList.add(new com.java8.utils.Employee("Male", "Rohan",null));
        //employeeList.add(new com.java8.utils.Employee("Female", "Disha",null));
        //employeeList.add(new com.java8.utils.Employee("Male", "Nilesh",null));
        //employeeList.add(new com.java8.utils.Employee("Male", "Suresh",null));
        Optional<Employee> nthEmployee = streamListIndexOperation.getNthEmployee(employeeList, 2);
        System.out.println("The Nth Employee is::"+nthEmployee.get());
    }

    public Optional<Employee> getNthEmployee(List<Employee> employeeList, int index) {
        Optional<Employee> employee = Optional.ofNullable(employeeList.stream()
                .filter(e->e.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.toList()).get(index));
        return employee.isPresent() ? employee : Optional.empty();
    }
}
