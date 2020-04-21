package com.java8.consumer;

import java.util.function.Consumer;

public class ConsumerExample
{
	public static void main(String[] args)
	{
		Consumer<String> consumer = i -> System.out.println(i);
		consumer.accept("Rohan");
		consumer.accept("Gupta");
	}
}
