package com.staticvsinstance;

public class StaticInstance {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 add();
		 StaticInstance obj=new StaticInstance();
		 obj.sub();
		 obj.multi();
		 

	}
	public static void add()
	{
		System.out.println("iam a add method");
	}
	public  void sub()
	{
		System.out.println("iam a sub meathod");
	
	}
	public  void multi()
	{
		System.out.println("iam a multi meathod");
	}
	

}
