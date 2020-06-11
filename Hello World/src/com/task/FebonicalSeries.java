package com.task;

public class FebonicalSeries {

	public static void main(String[] args) {
		 int n1=0,n2=1,n3,i;    
		 System.out.print(n1+" "+n2);   
		    
		 for( i=2;i<=50;++i)    
		 {    
		  n3=n1+n2;    
		  System.out.println(" "+n3);    
		  n1=n2;    
		  n2=n3;   
	
		 }
			
				
		}
		
	}


