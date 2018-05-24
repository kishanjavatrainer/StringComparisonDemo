package com.infotech.client;

//compareTo() and compareToIgnoreCase() methods of String class
public class ClientTest3 {

	public static void main(String[] args) {
		String str1 = "run";
		String str2 = new String("run");
		String str3 = "gun";
		String str4 = "sun";

		// equal so returns 0
		System.out.println(str1.compareTo(str2));

		// str1 > str3 so returns positive integer
		System.out.println(str1.compareTo(str3));
		// that's how used generally
		if (str1.compareTo(str3) > 0) {
			System.out.println("str1 is greater than str3");
		} else {
			System.out.println("str1 is less than str3");
		}

		// str1 < str4 so returns negative integer
		System.out.println(str1.compareTo(str4));
	}
}
