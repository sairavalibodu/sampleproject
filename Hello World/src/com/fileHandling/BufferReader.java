package com.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {

	//private static final Exception FileNotFoundException = null;

	public static void main(String[] args)throws Exception {
		
		    
	          FileReader fr=new FileReader("F:\\Ravali Java\\Project Bench\\my_first_project\\Hello World\\filename.txt");    
	          BufferedReader br=new BufferedReader(fr);    
		
	          int i;    
	         // BufferedReader br;
			while((i=br.read())!=-1){  
	          System.out.print((char)i);  
	          }  
	          br.close();    
	        //  BufferedReader fr;
			fr.close();    
	    }    
	}    
	


