package com.fileHandling;

import java.io.File;
//import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		File obj=new File("filename.txt");
		if(obj.canWrite())
		{
		System.out.println("loaded");
}else {
		System.out.println("unable");
}
	}

}
