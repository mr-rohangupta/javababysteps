package com.java8.generics;

import java.util.Arrays;
import java.util.List;

//Lower bounds can be used when we want to add any thing to list
public class LowerBoundExample
{
	public static void main(String[] args)
	{
		add(Arrays.asList(1, 2, 3, 4, 5));
	}

	public static void add(List<? super Number> list)
	{
		float sum = 0;


		for (Object number : list)
		{
			System.out.println(number);
		}
	}
}
