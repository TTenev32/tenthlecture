package com.regexstuff.thissome.newshit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.*;

public class ExTwo {
	
	static ArrayList<String> repository = new ArrayList<String>();
	static int count = 0;
	public static void main(String[] args) throws IOException {
	
		 try {
			BufferedReader kircho = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\lorem.txt"));
			String s = "";
			String strng = "";
			while ((s = kircho.readLine()) !=null){
				strng = strng + s;
				}
			kircho.close();
				regCheck("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}", strng);
		
			System.out.println("There were " + count + " emails" );
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void regCheck(String regx,String strg ){
		Pattern check = Pattern.compile(regx);
		Matcher matchr = check.matcher(strg);

		while(matchr.find()){
			if(matchr.group().length() != 0){
				System.out.println(matchr.group().trim());
				count++;
			}
		}
	}

}
