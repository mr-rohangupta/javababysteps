package com.java8.utils;

public class Address {

    private int pinCode;
    private String streetName;

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pinCode=" + pinCode +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
