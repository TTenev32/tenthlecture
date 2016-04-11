package com.twelfthlecture.thissome.newshit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class ExcesiseOne {
	public static void main(String[] args) throws IOException {
		TreeSet<String> nameStorage = new TreeSet<String>();
		
		try {
			BufferedReader kircho = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\letstryit.txt"));
			String s = "";
			while ((s = kircho.readLine()) !=null){
				nameStorage.add(s); 
			}
			kircho.close();
			JOptionPane.showMessageDialog(null, nameStorage);
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\justtriedit.txt"));
			Iterator<String> iter= nameStorage.iterator(); 
			while(iter.hasNext()){
				writer.write(iter.next() + System.lineSeparator());
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
