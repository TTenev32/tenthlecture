package com.twelfthlecture.thissome.newshit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExcersiseThree {
	public static ArrayList<String> array = new ArrayList<String>();
	public static ArrayList<String> checkedArray = new ArrayList<String>();
	public static ArrayList<String>  result = new ArrayList<String>();

	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\words.txt"));
		

		String s = "";

		while((s=reader.readLine()) != null){
		String[] stuff = s.split(" ");
			for(int i = 0; i < stuff.length; i++){
			array.add(stuff[i]);
			}
		}
		reader.close();
		BufferedReader secondReader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\text.txt"));
		
		String str= "";
		while((str = secondReader.readLine()) !=null){
			String[] stuffy = str.split(" ");
			for(int j = 0; j < stuffy.length; j++){
					checkedArray.add(stuffy[j]);
				}
			}
			secondReader.close();
			
			
			int count = 0;
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\result.txt"));
			for(int k = 0; k <array.size(); k++){
			count = 0;
			for (int i = 0; i < checkedArray.size(); i++){
				if(array.get(k).equals(checkedArray.get(i))){
					count++;
				}
			}

			result.add(count + " times" + "The word " + array.get(k) +" has been found. " + System.lineSeparator());
			System.out.println("The word " + array.get(k) +" has been found " + count + " times!");
			
		}
			Collections.sort(result, new DigitComparator());
			for (int v = 0; v < result.size(); v++ ){
				writer.write(result.get(v));
			}

			writer.close();
	}
	
	

}
