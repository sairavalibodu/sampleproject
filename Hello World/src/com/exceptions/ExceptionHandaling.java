package com.exceptions;

public class ExceptionHandaling {

	public static void main(String[] args) {
		try{
			int[] numbers= {1,2,3,4,5};
			System.out.println("the number is"+numbers[10]);
		}catch(Exception e)
		{
			System.out.println("array out of bound");
		}
		finally
		{
			System.out.println("the try and catch is finished");
		}
	}	

}
