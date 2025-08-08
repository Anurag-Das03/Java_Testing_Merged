package com.basicToOops;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 vh = new Car1();
		vh.start();
		vh.stop();
	}

}

interface Vehicle1{
	void start();
	void stop();
}

class Car1 implements Vehicle1 {
	public void start() {
		System.out.println("Started");
	}
	public void stop() {
		System.out.println("Stopped");
	}
}