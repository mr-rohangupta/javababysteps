package com.java8.infinitestream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerStreamDemo
{
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.iterate(2, i -> i * 2);
        List<Integer> collect = integerStream.skip(3)
                .limit(6)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
