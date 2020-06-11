package com.constructor;

public class Test1 {

	public static void main(String[] args) {
	ConstructorTest test1 =new ConstructorTest();
		ConstructorTest test2 =new ConstructorTest(30);
		ConstructorTest test3 =new ConstructorTest(30,40);
		
		test1.result();
		test2.result();
		test3.result();
        
			}

}
