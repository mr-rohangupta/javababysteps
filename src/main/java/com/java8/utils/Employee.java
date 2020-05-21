package com.java8.utils;

public class Employee {

    private String gender;
    private String name;
    private Address address;

    public Employee(String gender, String name, Address address) {
        this.gender = gender;
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
