package com.java10.localvariabletypeinference;

import java.util.List;

public class LocalVariableTypeInferenceDemo {
    public static void main(String[] args) {
        var number = List.of(1, 2, 3, 4, 5);
        number.forEach(System.out::println);
        System.out.println("Printing Loop ..........");
        for (var i = 0; i < number.size(); i++) {
            System.out.println(number.get(i));
        }
    }
}
