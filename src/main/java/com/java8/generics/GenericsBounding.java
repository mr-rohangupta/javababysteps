package com.java8.generics;

public class GenericsBounding
{

	public static <T extends Comparable<T>> T calculateMin(T t1, T t2)
	{
		if (t1.compareTo(t2) < 0)
		{
			return t1;
		}

		return t2;
	}

	public static void main(String[] args)
	{
		System.out.println(GenericsBounding.calculateMin(100, 23));
	}
}
