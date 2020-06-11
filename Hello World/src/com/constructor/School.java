package com.constructor;

public class School {
	String name;
	int age;
	int id;
	int std;
	School(String name,int age,
	int id,
	int std)
	{
		this.age=age;
		this.name=name;
		this.id=id+1;
		this.std=std;
	}
	public void getStudentDetails()
	{

		System.out.println("Student Name :"+name);
		System.out.println("Student Age :"+age);
		System.out.println("Student Standard :"+std);
		System.out.println("Student id :"+id);
	}

}
