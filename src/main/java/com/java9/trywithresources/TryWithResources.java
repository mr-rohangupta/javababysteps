package com.java9.trywithresources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResources
{
	public static void main(String[] args) throws FileNotFoundException
	{
		FileOutputStream fileOutputStream = new FileOutputStream("myFile.txt");
		try (fileOutputStream)
		{
			String message = "Hello and welcome to java 9";
			fileOutputStream.write(message.getBytes());
			System.out.println("File written successfully..");
		}
		catch (Exception e)
		{
			System.out.println("Exception while writing to file" + e.getMessage());
		}

	}
}
