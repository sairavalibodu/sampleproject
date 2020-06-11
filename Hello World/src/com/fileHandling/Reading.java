package com.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {

	public static void main(String[] args) {
		try
		{
			File myobj=new File("F:\\Ravali Java\\Project Bench\\my_first_project\\Hello World\\test.txt");
			Scanner myreadder=new Scanner(myobj);
			while(myreadder.hasNextLine())
			{
				String data=myreadder.nextLine();
				System.out.println(data);
			}
			myreadder.close();
					
		}
		catch(FileNotFoundException e )
		{
			System.out.println("cannot read the file");
			e.printStackTrace();
		}
	}

}
