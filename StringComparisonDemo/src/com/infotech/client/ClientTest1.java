package com.infotech.client;

//startsWith() and endsWith() methods of String class
public class ClientTest1 {

	public static void main(String[] args) {
		String str = "This is a test string";
		// Should be true
		System.out.println(str.startsWith("This"));
		// test start at index 10, so returns true
		System.out.println(str.startsWith("test", 10));

		// returns false
		System.out.println(str.endsWith("test"));
		// returns true
		System.out.println(str.endsWith("test string"));
		// returns true
		System.out.println(str.endsWith("string"));
	}
}
