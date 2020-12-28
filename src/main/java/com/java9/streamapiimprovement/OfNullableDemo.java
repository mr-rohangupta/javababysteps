package com.java9.streamapiimprovement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OfNullableDemo {
    public static void main(String[] args) {
        List<String> stringList = Stream.of("Java 8", "Java 9", "Java 10", "Java 11", "Java 14")
                .collect(Collectors.toList());
        Stream<List<String>> nullableList = Stream.ofNullable(stringList);
        nullableList.forEach(System.out::println);

    }
}
