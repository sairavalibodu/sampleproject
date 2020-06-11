package com.opps;

public class StaticvsPublic {
	static void mymethod1() {
		System.out.println("method is called with static");
		
	}
	public void mymethod2()
	{
	System.out.println("my method is calles with public");
	}
	public void carspped(int maxspeed)
	{
		System.out.println("the car speed is"+maxspeed);
	}

	public static void main(String[] args) {
		mymethod1();
		StaticvsPublic obj=new StaticvsPublic();
		obj.mymethod2();
		obj.carspped(100);
		
	}

}
