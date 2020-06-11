package com.arrays;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner Scanner=new Scanner(System.in);
		int userinput=Scanner.nextInt();
		for (int i=1;i<=20;i++)
		{


			System.out.println(userinput + " * "+i+" = "+ (i*userinput));


		}
		
		
	}

}
