package com.fileHandling;

import java.io.File;

public class FileMethods {

	public static void main(String[] args) {
		File  myobj=new File("test.txt");
		if(myobj.exists())
		{
			System.out.println("getname:"+myobj.getName());
			System.out.println("getabsolutepath:"+myobj.getAbsolutePath());
			System.out.println("canread:"+myobj.canRead());
			System.out.println("canwrite"+myobj.canWrite());
			System.out.println("file size:"+myobj.length());
		}
		else
		{
			System.out.println("file doesnot exits");
		}
	}

	
	}


