package com.java8.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeInference
{
	public static <T> void addStore(T t, List<Bucket<T>> list)
	{
		Bucket<T> bucket = new Bucket<>();
		bucket.setItem(t);
		list.add(bucket);
		System.out.println(t.toString() + " has been added to the list");
	}


	public static void main(String[] args)
	{
		List<Bucket<String>> list = new ArrayList<>();
		TypeInference.addStore("Rohan", list);

		TypeInference.<String>addStore("Tushar", list);
	}
}

class Bucket<T>
{
	private T item;

	public T getItem()
	{
		return item;
	}

	public void setItem(T item)
	{
		this.item = item;
	}
}
