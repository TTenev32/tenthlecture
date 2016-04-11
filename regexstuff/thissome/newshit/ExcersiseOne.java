package com.regexstuff.thissome.newshit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExcersiseOne {

	static Scanner in = new Scanner(System.in);
	static ArrayList<String> urls = new ArrayList<String>();
	
	public static void main(String[] args) {
		String newurl = in.next();
		if (Pattern.matches("^http://[a-zA-Z0-9+.]*[a-zA-Z0-9]", newurl)){
			urls.add(newurl);
			System.out.println("Done and done");
		} else {
			System.out.println("Try harder next time ok?");
		}
		
		
	}
	
	
}
