package com.basicToOops;

public class StringBuffer_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer receipt = new StringBuffer();
		
		receipt.append("Receipt");
		receipt.append("Customer: Anurag \n");
		receipt.append("items: \n");
		receipt.append("  Bread-11 \n");
		receipt.append("  Coffee-40 \n");
		receipt.append("  Apples-20 \n\n");
		receipt.append("Total: 71 \n\n");
		receipt.append("Thanks for Shopping");
		
		receipt.insert(31, "\n  Sweets-10");
		System.out.println(receipt);
		
		StringBuffer strB = new StringBuffer("Reverse");
		
		
		System.out.println(strB.reverse());
		System.out.println(strB.append("Reverse ").reverse());
	}

}
