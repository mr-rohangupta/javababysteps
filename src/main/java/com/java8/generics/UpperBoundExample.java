package com.java8.generics;

import java.util.Arrays;
import java.util.List;

//In upper bound we can not add to list
public class UpperBoundExample
{

	public static void sum(List<? extends Number> list)
	{
		double sum = 0;
		for(Number number : list){
			sum = sum + number.doubleValue();
		}
		System.out.println("The sum is ::"+sum);

	}

	public static void main(String[] args)
	{
		sum(Arrays.asList(1, 2, 3, 4));
	}
}
