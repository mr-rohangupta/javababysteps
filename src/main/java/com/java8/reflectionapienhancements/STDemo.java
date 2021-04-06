package com.java8.reflectionapienhancements;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Calculate {
    int add(int a, int b){
        return (a+b);
    }
    int sub(int a, int b){
        return (a-b);
    }
}


public class STDemo {
    public static void main(String[] args){

        Class<? extends Calculate> cal = new Calculate().getClass();
        // Get methods
        Method[] method = cal.getDeclaredMethods();
        System.out.println("Method Name: "+ method[0].getName());
        // get parameters
        System.out.println("Parameters: ");
        Parameter[] parameters = method[0].getParameters();
        System.out.println(parameters[0].getType()+" "+parameters[0].getName());
        System.out.println(parameters[1].getType()+" "+parameters[1].getName());


    }
}