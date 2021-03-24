package com.java8.lambdafunctional;

interface Runnable {
    String run(int speed, int distance);
}

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable runnable = (int speed, int distance) -> {
            return "Distance of " + distance + " Km " + " Covered with the speed of " + speed + " km/hr ";
        };
        String run = runnable.run(140, 2000);
        System.out.println("Running a " + run);
    }
}
