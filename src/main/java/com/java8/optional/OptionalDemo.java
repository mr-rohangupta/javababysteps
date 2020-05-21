package com.java8.optional;

import com.java8.utils.Address;
import com.java8.utils.Employee;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreetName("Nelson Street");
        address.setPinCode(400125);
        Employee employee = new Employee("Male", "Rohan", address);
        OptionalDemo optionalDemo = new OptionalDemo();
        Optional<String> streetName = optionalDemo.getStreetName(Optional.ofNullable(employee));
        System.out.println("Street Name "+streetName.get());
    }

    public Optional<String> getStreetName(Optional<Employee> employee) {
        return employee
                .flatMap(emp -> Optional.ofNullable(emp.getAddress()))
                .flatMap(streetName -> Optional.ofNullable(streetName.getStreetName()));
    }

}
