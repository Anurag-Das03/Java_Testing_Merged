package com.basicToOops;

public class var_exp {
	int ins= 124;
	static float p = 3.14f;
	
	public void show() {
		String name = "Anurag Das";
		System.out.println("Local var: "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var_exp obj = new var_exp();
		obj.show();
		System.out.println("Staic var : "+p);
		System.out.println("Instance Variable :"+obj.ins);
	}

}
