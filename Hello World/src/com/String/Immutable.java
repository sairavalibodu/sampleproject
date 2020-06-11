package com.String;

public class Immutable {

	public static void main(String[] args) {
		int e=0,o=1,a;	//define even and odd variables
		String s="3b5d6c7";		// define string
		String fs = null;
		int l=s.length();	// find out strings length
		int r=l%2; // divide the length by 2 if remainder is =0 then there are equal number of int and char pairs else 
		if(r==1) 
		{
			fs=s.substring(0,6) ; // strip away the last character from string to make it equal pairs of int and char
		}
		
		int pair = fs.length()/2; // calculate the total number of int and char pairs
		
		for(a=1;a<=pair;a++)
		{
			char m = fs.charAt(e); // get character at even position
			int abc = Character.getNumericValue(m); // type cast it to int
			char n=fs.charAt(o); // get character at odd position
			for(int z=1;z<=abc;z++)
			{
				System.out.print(n);
			}
			
			System.out.println("");
			e = e+2; // increment even by 2 positions
			o = o+2; // increment odd by 2 positions
		}
			
	}

}
