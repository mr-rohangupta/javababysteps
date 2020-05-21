package com.java8.lambdafunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class LamdaExecutorExample {
  public static void main(String[] args) {
    List<Integer> firstList = new ArrayList<>();
    firstList.add(10);
    firstList.add(20);
    firstList.add(30);
    List<Integer> secondList = new ArrayList<>();
    secondList.add(10);
    secondList.add(20);
    secondList.add(30);
    List<Integer> thirdList = new ArrayList<>();
    thirdList.add(10);
    thirdList.add(20);
    thirdList.add(30);
    List<List<Integer>> finalList = new ArrayList<>();
    finalList.add(firstList);
    finalList.add(secondList);
    finalList.add(thirdList);
    ExecutorService executorService = Executors.newCachedThreadPool();

    List<Future<Integer>> collect = finalList.stream()
        .map(element -> executorService.submit(() -> element.stream().mapToInt(i -> i).sum()))
        .collect(Collectors.toList());
    collect.forEach(f -> {
      try {
        System.out.println(f.get());
      } catch (InterruptedException | ExecutionException e) {
        f.cancel(true);
        e.printStackTrace();
      }
    });
  }
}
