package com.java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {
  public static void main(String[] args) {
    Supplier<Date> systemDate = () -> new Date();
    System.out.println(systemDate.get());
  }
}
