package com.java9.anonymousinnerclass;

public class TypeInferExample {
    public static void main(String[] args) {
        GenericAdd<String> stringGenericAdd = new GenericAdd<String>() {
            @Override
            String show(String a, String b) {
                return a + b;
            }
        };
        String result = stringGenericAdd.show("Java", "9 Feature Anonymous Class Improvement");
        System.out.println("The Result::" + result);
    }
}
