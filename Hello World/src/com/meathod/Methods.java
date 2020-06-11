package com.meathod;

public class Methods {
	
	public static int add(int a, int b) { 
		return	a+b;

	}

	public static int multiply(int a, int b) { 
		return	a*b;

	}
	public static int div(int a, int b) { 
		return	a/b;

	}


	
	
	public static void main(String Args[]) {
	int x = add(33,44);
	int k = multiply(2,3);
	int l = div(336,445);
	int m = sub(373,484);
	int o = add(383,454);
	System.out.println(x );
	
	System.out.println(k);
	System.out.println(l);
	System.out.println(m);
	System.out.println(o);
	}

	public static int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}
	
	
}
