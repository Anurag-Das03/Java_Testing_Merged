package com.basicToOops;
public class Employee_details {
	
	int id;
	String name;
	String dept;
	double sal;
	
	void setDetails(int empId, String empName, String dep, double salary) {
		id= empId;
		name = empName;
		dept = dep;
		sal = salary;
	}
	
	 void displayDetails() {
	     System.out.println("ID : " + id);
	     System.out.println("Name : " + name);
	     System.out.println("Department: " + dept);
	     System.out.println("Salary :" + sal);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee_details emp = new Employee_details();
		 
		 emp.setDetails(111,"Anurag","IT",10000.75);
		 emp.displayDetails();
		 
}
}
