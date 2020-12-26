package com.java9.collectionfactorymethods;

import java.util.Map;

public class MapOfEntriesExample {
    public static void main(String[] args) {
        Map.Entry<Integer, String> entry1 = Map.entry(8, "Java 8");
        Map.Entry<Integer, String> entry2 = Map.entry(9, "Java 9");

        Map<Integer, String> map = Map.ofEntries(entry1, entry2);

        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " " + integerStringEntry.getValue());
        }
    }
}
