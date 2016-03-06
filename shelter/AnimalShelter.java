package com.tenthlecture.shelter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AnimalShelter<T extends ArrayList> {
	private T t;
	public  Scanner in =  new Scanner(System.in);
	String addOne = in.next();
	int addTwo = in.nextInt();

	public static ArrayList<Dog> shelter = new ArrayList<>();

	public static <T extends Dog> void printOut(int index){
		System.out.println("Name "+ shelter.get(index).breed.toString());
		System.out.println("Age " + shelter.get(index).age);
	}
	//swap function from exercise Four. However, Collections.swap does a much better job here
	public static <T extends Integer> void changePlaces(Integer first, Integer second){
		int tempObject = first;
		first = second;
		second = tempObject;
	}
	
	public static<T extends Dog> void addDog(Dog kiro){
		shelter.add(kiro);
	}
	//remove Dog by index
	public static<T extends Dog> void removeDog(Integer indx){
		shelter.remove(shelter.indexOf(shelter.get(indx)));
		
	}
	
	public static void main(String[] args) {


		for(int i =0; i < 5; i++){
			shelter.add(i, new Dog("parcho " +i, 16));
			shelter.add(i, new Pitbull("balkan " +i, 17, true));
		}
		printOut(3);
		Collections.swap(shelter, shelter.indexOf(shelter.get(3)) , shelter.indexOf(shelter.get(6)));
		printOut(3);
		printOut(1);
		addDog(new Pitbull("Kircho", 27, true));
		printOut(shelter.indexOf(shelter.get(10)));
		removeDog(1);
		printOut(9);
	}

}
