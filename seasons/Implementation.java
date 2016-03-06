package com.tenthlecture.seasons;

import java.util.Scanner;

public class Implementation {

	
	static Scanner in = new Scanner(System.in);
	
	static int seas = in.nextInt();
	public Sezonie seasons;
	public static void main(String[] args) {
		Months.months(seas);
	}

}
