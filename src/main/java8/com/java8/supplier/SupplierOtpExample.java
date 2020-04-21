package com.java8.supplier;

import java.util.function.Supplier;

public class SupplierOtpExample {
  public static void main(String[] args) {
    Supplier<String> otpGenerator = () -> {
      String otp = "";
      for (int i = 0; i < 6; i++) {
        otp = otp + (int) (Math.random() * 10);
      }
      return otp;
    };
    System.out.println("Otp Generated ::" + otpGenerator.get());
  }
}
