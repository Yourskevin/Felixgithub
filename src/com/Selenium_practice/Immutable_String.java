package com.Selenium_practice;

public class Immutable_String {
	public static void main(String[] args) {
				String s1= "jackson";
//		String s2="jackson";
		
		StringBuilder obj = new StringBuilder("google  help, geloc");   //mutable   --asynchrinized-
//		StringBuffer obj1 = new StringBuffer("google");    // synchronised
		
	StringBuilder rev = obj.reverse();	
	System.out.println(rev);
	}

}
