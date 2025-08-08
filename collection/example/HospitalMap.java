package com.collection.example;

import java.util.HashMap;

public class HospitalMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Patientmap> map = new HashMap<>();
		Patientmap p1 = new Patientmap(123,"Sam","fever");
		Patientmap p2 = new Patientmap(234,"Smith","Cough");
		Patientmap p3 = new Patientmap(345,"Sad","Cold");
		
		map.put(p1.getId(), p1);
		map.put(p2.getId(), p2);
		map.put(p3.getId(), p3);
		System.out.println("The Patinet with the key :"+p1.getId());
		System.out.println(map.get(123)+"\n");
		
		System.out.println("Whether or not the hasmap conatains the key :"+p2.getId());
		System.out.println(map.containsKey(234)+"\n");
		
		System.out.println("Whether or not the hashmap contains the given value: ");
		System.out.println(map.containsValue(p1)+"\n");
		
		System.out.println("Total Patients: "+map.size()+"\n");
		
		System.out.println("All the Available Key value pairs: ");
		System.out.println(map.entrySet()+"\n");
		
		System.out.println("Removing the Patient with Id: "+p3.getId());
		System.out.println(map.remove(345, p3)+"\n");
		
		System.out.println("All available Patient IDs/Keys: ");
		System.out.println("All the keys : "+map.keySet()+"\n");
		
		System.out.println("Whether the HashMap is Empty or not: ");
		System.out.println(map.isEmpty());
		
		Patientmap p4 = new Patientmap(001, "Binay", "Flu");
		System.out.println("");
		map.replace(p2.getId(), p2, p4);
		System.out.println(map.get(234)+"\n");
		System.out.println(map.entrySet()+"\n");
		
		map.clear();
	}

}

class Patientmap{
	private int id;
	private String name;
	private String disease;
	
	public Patientmap(int id, String name, String disease) {
		this.id=id;
		this.name=name;
		this.disease=disease;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDisease() {
		return disease;
	}
	public String toString() {
		return "Patient ID: "+id+" , Name: "+ name+" , Disease: "+disease;
	}
}