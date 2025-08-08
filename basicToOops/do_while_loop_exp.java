package com.basicToOops;

public class do_while_loop_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 110;
		do {
			System.out.println("The patient has fever. Current Temperature : "+ temp);
			temp-=5;
		}
		while(temp>=100);
		System.out.println("The patient is normal now");
	}

}
