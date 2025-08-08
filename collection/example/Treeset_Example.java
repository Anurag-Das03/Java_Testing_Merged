package com.collection.example;

import java.util.TreeSet;

public class Treeset_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet<Integer> rooms = new TreeSet<>();
//		rooms.add(203);
//		rooms.add(112);
//		rooms.add(124);
//		rooms.add(200);
//		rooms.add(194);
//
//		System.out.println("Available Rooms(Sorted) : ");
//		for (int room : rooms) {
//			System.out.println("Rooms: " + room);
//		}
//		System.out.println("\n First Available room: " + rooms.first());
//		System.out.println("\n Lasst Available room: " + rooms.last());
//	}
	
	TreeSet<String> fruit = new TreeSet<>();
	
	fruit.add("Apple");
	fruit.add("Mango");
	fruit.add("Orange");
	fruit.add("Banana");
	
	System.out.println("Fruits in Ascending Ordr: ");
	for(String str : fruit) {
		System.out.println(str);
	}
	System.out.println("\nFruits in Descending Order: ");
	System.out.println(fruit.reversed());
	

}
}
