package com.thiskeyword;

public class ThisKeyword {
	int a=20;
	int b=30;

	

	public static void main(String[] args) {
		ThisKeyword ref=new ThisKeyword();
		ref.add(10,20);
		
}
	public  void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		
	}
}