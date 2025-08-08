package com.basicToOops;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int Integer = 12;
//		 char import = 'A';
//		 System.out.println(Integer);
//		 System.out.println(String);
//		System.out.println(MyClass.add(34,12));
		
		
		MyClass c = new MyClass("... ");
		c.display();

		MyClass c1 = new MyClass();
		c1.display();
	}

}

class MyClass {

	MyClass() {
		System.out.println("This is the default Constructor");
	}

	MyClass(String name) {
		System.out.println(name + "Constructor with paramter");
	}

	void display() {
		System.out.println("This is the display method");
	}
}

// static class MyClass1{
//	static int sub(int a, int b) {
//		return a-b;
//	}
//	 int add1(int a, int b) {
//		return a+b;
//}



