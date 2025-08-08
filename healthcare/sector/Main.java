package com.healthcare.sector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new Patient(11, "Mark", 45, "Fever");
		Patient p2 = new Patient(12, "Sam", 32, "Heart");
		
		// System.out.println(p1.getAge());
		
		PatientService service = new PatientServiceIml();
		service.patientRegister(p1);
		service.patientRegister(p2);
		service.showDetails(12);
		
		Doctor doc = new Cardiologist("Dr. Renu", "Cardiologist");
		doc.diagnose(p2);
	}

}
