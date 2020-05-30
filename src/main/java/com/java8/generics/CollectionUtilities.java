package com.java8.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUtilities
{
	public <T> List<T> list()
	{
		List<String> list = new ArrayList<>();
		list.forEach(System.out::println);
		return Collections.emptyList();
	}

	public <T> List<T> list(T t)
	{
		return Collections.singletonList(t);
	}

	public <T> List<T> list(List<T> t)
	{
		return Collections.unmodifiableList(t);
	}

}
