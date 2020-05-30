package com.java8.infinitestream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamDemo
{
	public static void main(String[] args)
	{
		IntStreamDemo intStreamDemo = new IntStreamDemo();
		final List<Integer> integers = intStreamDemo.numbersSupplier(-10, -1);
		integers.forEach(System.out::println);
	}

	public List<Integer> numbersSupplier(int startRange, int endRange)
	{
		Supplier<List<Integer>> numbersSupplier = () -> {
			return IntStream.range(startRange, endRange)
			                .mapToObj(Integer::valueOf)
			                .collect(Collectors.toList());

		};
		return numbersSupplier.get();
	}
}
