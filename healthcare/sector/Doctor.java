package com.healthcare.sector;

public abstract class Doctor {
	String name;
	String specialization;
	
	public Doctor(String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}
	public abstract void diagnose(Patient p1);
}
