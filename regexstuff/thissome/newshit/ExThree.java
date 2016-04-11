package com.regexstuff.thissome.newshit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;

public class ExThree {
	
	public static void main(String[] args) throws IOException {
	
		 try {
			BufferedReader kircho = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\lorem.txt"));
			String s = "";
			String strng = "";
			while ((s = kircho.readLine()) !=null){
				strng = strng + s;
				}
			kircho.close();
				regCheck("[^!?.]*lorem[^.?!]*\\.", strng);
			
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
			}
		}
	}

}