package com.java9.collectionfactorymethods;

import java.util.Set;

public class SetOfExample {
    public static void main(String[] args) {
        Set<String> stringList = Set.of("Java 8", "Java 9", "Java 10", "Java 11", "Java 14");
        stringList.forEach(System.out::println);
    }
}
