package com.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WrittingFile {

	public static void main(String[] args) {
		try {
		
		FileWriter mywriter=new FileWriter("F:\\Ravali Java\\Project Bench\\my_first_project\\Hello World\\test.txt");
		mywriter.write("iam in java handling topic ");
		
		mywriter.close();
		System.out.println("text is written successfully");
		
		}
		catch(IOException e)
		{
			System.out.println("an error occured");
			e.printStackTrace();
		}
	}

}
