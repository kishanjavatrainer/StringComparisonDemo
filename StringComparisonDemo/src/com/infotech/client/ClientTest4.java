package com.infotech.client;

public class ClientTest4 {
	// Matches() method for string comparison
	public static void main(String[] args) {
		String[] words = { "Java","java8","a123", "*pass", "test", "xy4&ty","kk" };
		for (String str : words) {
			if (str.matches("[a-zA-Z]+")) {
				System.out.println("matched string - " + str);
			}
		}
	}
}
