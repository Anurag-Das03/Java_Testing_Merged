package com.basicToOops;
import java.util.Scanner;

public class Encap_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ex_exp obj = new ex_exp();
//		obj.setName(40000.66);
//		System.out.println("The salary is: "+obj.getName());	
		
		
//		ex_exp obj = new ex_exp();
//		obj.deposit(10000);
//		obj.withdraw(300);
		
		
		Patient p1 = new Patient();
		p1.setName("Patient");
		System.out.println("The patient's name is :"+p1.getName());
		p1.setHealthInfo("Healthy");
		System.out.println("Status : "+p1.getHealthInfo());

		
		
		ex_exp obj = new ex_exp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Voter ID: ");
		String voterId = sc.nextLine();
		obj.setVoterId(voterId);
		
		System.out.println("For Voting press true ");
		boolean giveVote = sc.nextBoolean();
		
		
		obj.vote(giveVote);
		obj.canVote();
	
	}
			
}
