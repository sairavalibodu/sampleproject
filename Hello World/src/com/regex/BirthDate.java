package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BirthDate {
	public static void main(String Args[]) {

		String regex = "[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}\n\n\n\n\n";
		String string = "my date of birth 05/03/1991";

		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(string);

		while (matcher.find()) {
			System.out.println("Full match: " + matcher.group(0));
			for (int i = 1; i <= matcher.groupCount(); i++) {
				System.out.println("Group " + i + ": " + matcher.group(i));
			}
		}
	}
}
