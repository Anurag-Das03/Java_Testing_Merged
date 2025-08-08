package com.collection.example;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class HospitalTreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> patientMap = new TreeMap<>();
		
		patientMap.put(101, "Sam");
		patientMap.put(211, "Smith");
		patientMap.put(111, "Sid");
		patientMap.put(202, "Binay");
		patientMap.put(100, "Akash");
		patientMap.put(115, "Aman");
		
		// Patient sorted by ID
		System.out.println("Sorted Patient List: ");
		for(Map.Entry<Integer, String> entry : patientMap.entrySet()) {
		System.out.println("ID: "+ entry.getKey()+" -> "+entry.getValue());
		}
		
		// Set First and Last ID 
		System.out.println("\nFirst Patient ID: "+ patientMap.firstKey());
		System.out.println("Last Patient ID: "+ patientMap.lastKey());
		
		//Specific ID
		System.out.println("\nPatient with ID 111: "+ patientMap.get(111));
		
		// Remove Patient
		patientMap.remove(202);
		System.out.println("\nRemoved Patient with ID 202\n");
		
		//Check If Exists
		System.out.println("Has ID 111 ? "+patientMap.containsKey(111));
		
		// DEscending Order
		System.out.println("\nDescending Order: "+patientMap.reversed());
		
		//Descending Order
		System.out.println("Descending Patient List: ");
		NavigableMap<Integer, String> revMap = patientMap.descendingMap();
		for(Map.Entry<Integer, String> e: revMap.entrySet()) {
			System.out.println("ID: "+ e.getKey()+" -> "+e.getValue());
		}
		
		
	}

}
