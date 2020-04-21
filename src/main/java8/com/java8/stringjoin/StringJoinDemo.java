package com.java8.stringjoin;

public class StringJoinDemo {
  public static void main(String[] args) {
    String baseUrl = "localhost:8080/getByUser";
    String courseId = "courseId";
    String bssVer = "bssVER";

    String finalURL = baseUrl + "?" + String.join("&", "courseId=" + courseId, "bssVer=" + bssVer);
    System.out.println(finalURL);
  }
}
