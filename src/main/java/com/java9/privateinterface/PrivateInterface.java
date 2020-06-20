package com.java9.privateinterface;

interface Engine
{
	default void run()
	{
		startEngine();
	}

	private void startEngine()
	{
		System.out.println("Car is starting..!!!");
	}
}

public class PrivateInterface
		implements Engine
{
	public static void main(String[] args)
	{
		Engine engine = new PrivateInterface();
		engine.run();
	}
}
