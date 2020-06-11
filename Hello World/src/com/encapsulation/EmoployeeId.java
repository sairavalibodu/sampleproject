package com.encapsulation;

public class EmoployeeId {

	public static void main(String[] args) {
		EmployeeData obj=new EmployeeData();
		obj.setId(1001);
		obj.setName("sai");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}

}