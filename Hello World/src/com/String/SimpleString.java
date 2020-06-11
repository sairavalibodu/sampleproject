package com.String;

public class SimpleString {

	public static void main(String[] args) {
		String my="hi iam ravali";
		String hi="hi iam ravali";
		System.out.println(my.compareTo(hi));
		System.out.println(my.contentEquals(hi));
		char result=my.charAt(5);
		System.out.println(result);
		System.out.println(my.length());
		System.out.println(my.indexOf("iam"));
		System.out.println(my.toLowerCase());
		System.out.println(my.toUpperCase());
	}
		
	}