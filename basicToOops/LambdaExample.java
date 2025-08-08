package com.basicToOops;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate add = (x,y) -> x+y ;
		double result = add.operation(12, 23);
		System.out.println(result);
		
		Calculate sub = (x,y) -> x-y;
		double result1 = sub.operation(120, 25);
		System.out.println(result1);
		
		Calculate multi = (x,y) -> x*y;
		double result2 = multi.operation(12, 12);
		System.out.println(result2);
		
		
		Calculate multi1 = new Calculate() {
			public double operation(double x,double y)
			{
				return x*y;
			}

			
		};
		Calculate multi2 = (x,y) -> {
			System.out.println("hhh");
			return x*y;
		};
	}
}

interface Calculate {
	double operation(double x, double y);
	// void ops();
}
