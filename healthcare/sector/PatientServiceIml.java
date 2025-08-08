package com.healthcare.sector;

import java.util.HashMap;

public class PatientServiceIml implements PatientService {
	
	HashMap<Integer , Patient> map= new HashMap<>();
	
	public void patientRegister(Patient p1) {
		map.put(p1.getId(),p1);
		System.out.println( p1.getName()+" is Registered");
	}

	public void showDetails(int patientId) {
		Patient p2 = map.get(patientId);
		if (p2!= null) {
			System.out.println("ID: "+ p2.getId());
			System.out.println("Name: "+ p2.getName());
			System.out.println("Age: "+ p2.getAge());
			System.out.println("Illness: "+ p2.getIllness());
		} else {
			System.out.println("No patient with this ID exist");
		}
		
	}

}
