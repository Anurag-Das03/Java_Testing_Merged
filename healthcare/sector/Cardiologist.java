package com.healthcare.sector;

public class Cardiologist extends Doctor {

	public Cardiologist(String name, String specialization) {
		super(name, specialization);
	}
	
	public void diagnose(Patient p1) {
		System.out.println("Cardiologist "+name);
		if(p1.getIllness().toLowerCase().contains("heart")) {
			System.out.println("Diagnosis: Heart-related");
		} else {
			System.out.println("Diagnosis: Not a heart related issue");
		}
	}
	
}
