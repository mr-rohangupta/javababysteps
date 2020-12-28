package com.java9.streamapiimprovement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DropWhileDemo {
    public static void main(String[] args) {
        List<Integer> list
                = Stream.of(2,2,3,4,5,6,7,8,9,10)
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
