package com.java9.safevaragrsannotation;

import java.util.ArrayList;
import java.util.List;

public class SafeVarArgs {

    public static void main(String[] args) {
        SafeVarArgs safeVarArgs = new SafeVarArgs();
        List<String> list = new ArrayList<>();
        list.add("Phone");
        list.add("Watch");
        safeVarArgs.display(list);
    }

    @SafeVarargs
    private void display(List<String>... products) {
        for (List<String> product : products) {
            System.out.println(product);
        }
    }
}
