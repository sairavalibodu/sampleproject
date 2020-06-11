package com.task;

import java.util.Scanner;

public class FactorialNumber {

	 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    

public static void main(String[] args)
{
	int i;
	int x;
	int j;
	int m=1;
	int a=1;
	System.out.println("enter the number");
	Scanner scanner=new Scanner(System.in);
		int userInput=scanner.nextInt();
		int temp=userInput;
		//method 1
		for(i=userInput;i>=1;i--)				
		{				
			x = temp*(i-1);
			temp = x;		
			System.out.println(x);
		}
		
		// method 2
		
		for(j=1; j<=userInput;j++)
		{
			m = m*j;
		}
		System.out.println("Method 2 Output : "+m);
		
		
		// method 3
		
		a = factorial(userInput);
		
		System.out.println("Method 3 Output : "+a);
	}

}
