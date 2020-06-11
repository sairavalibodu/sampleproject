package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File myobj=new File("filename.xlsx");
					if(myobj.createNewFile())
					{
					System.out.println("file create:"+myobj.getName());
			
		}else
		{
			System.out.println("file already exits");
		}
		}// try block
	catch(IOException e)
		{
		System.out.println("error occured");
		e.getStackTrace();
		} // catch block
		
	
		
	} // main method


}
	

