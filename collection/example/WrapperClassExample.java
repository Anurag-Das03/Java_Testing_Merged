package com.collection.example;

import java.util.ArrayList;

public class WrapperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1000); //AutoBoxing
		int value = list.get(0);  //UnBoxing
		System.out.println("Value: "+ value);
	}

}
