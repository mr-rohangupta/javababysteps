package com.java10.collectionapichanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionApiChangesDemo {
    public static void main(String[] args) {
        List<String> javaVersions = new ArrayList<>();
        javaVersions.add("Java 8");
        javaVersions.add("Java 9");
        System.out.println("Java Versions ::" + javaVersions);
        List<String> copyOfJavaVersions = List.copyOf(javaVersions);
        System.out.println("Copy Of Actors::" + copyOfJavaVersions);

        javaVersions.add("Java 10");
        System.out.println(javaVersions);
        System.out.println(copyOfJavaVersions);

        String str = "";
        Optional<String> name = Optional.ofNullable(str);
        name.orElseThrow();

        List<String> unmodifiableList = javaVersions.stream().collect(Collectors.toUnmodifiableList());
        unmodifiableList.add("Java 14");
    }
}
