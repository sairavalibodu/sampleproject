package com.constructor;

public class ConstructorTest {
	int a;
	int b;
	//zero parameterized constructor
	
  ConstructorTest()
{
	System.out.println("zerp parameterized");
	
}
  ConstructorTest(int a)
{
	this.a=10;
	System.out.println("one parameter");
}
  ConstructorTest(int a,int b)
{
	this.a=a;
	this.b=a;
	System.out.println("two parameter");
}
  public void result() {
	  System.out.println("the first constructor:"+a);
	  System.out.println("the 2nd constructor:"+b);
	  
  }
}

