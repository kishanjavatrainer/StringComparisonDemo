package com.infotech.client;

public class ClientTest2 {
	// equals() and equalsIgnoreCase() methods of String class
	public static void main(String[] args) {
		String str = "This is a test string";
		String str1 = new String("This");
		
		System.out.println("String for comparison -- " + str.substring(0, 4));
		
		// Should be true
		System.out.println(str.substring(0, 4).equals("This"));
		// will be false, equals is case sensitive
		System.out.println(str.substring(0, 4).equals("this"));

		// returns true, case is ignored
		System.out.println(str.substring(0, 4).equalsIgnoreCase("this"));
		// returns true
		System.out.println(str1.equalsIgnoreCase("this"));
	}
}
