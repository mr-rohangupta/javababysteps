package com.java9.collectionfactorymethods;

import java.util.List;

public class ListOfExample {
    public static void main(String[] args) {
        List<String> stringList = List.of("Java 8", "Java 9", "Java 10", "Java 11", "Java 14");
        stringList.forEach(System.out::println);
    }
}
