package com.testgenericmethods;

import com.genericmethods.GenericMethods;

public class TestgenericMethods {

	public static void main(String[] args) {
		GenericMethods launch = new GenericMethods();
		
		launch.launchBrowser("Chrome");
		launch.waitTill_Element_Displayed("");

		launch.closeBrowser("");

		
		
		
	}

}
