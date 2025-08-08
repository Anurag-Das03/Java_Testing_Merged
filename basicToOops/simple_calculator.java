package com.basicToOops;

public class simple_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 20.9f;
		float b = 14.4f;
		char op = '*';
		switch (op) {
		case '+':
			System.out.println(a + b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '%':
			System.out.println(a % b);
			break;
		default:
			System.out.println("Invalid Operator");
		}
	}

}
