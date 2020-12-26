package com.java9.collectionfactorymethods;

import java.util.Map;

public class MapOfExample {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = Map.of(8, "Java 8", 9, "Java 9", 10, "Java 10");
        for (Map.Entry<Integer, String> integerStringEntry : integerStringMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " " + integerStringEntry.getValue());
        }
    }
}
