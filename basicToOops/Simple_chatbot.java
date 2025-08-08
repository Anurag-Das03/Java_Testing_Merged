package com.basicToOops;
import java.util.Scanner;
public class Simple_chatbot {
	
	
	void chatBot(String msg) {
		msg.toLowerCase();
		if (msg.contains("hi")){
			System.out.println("Hello, how can I help you?");
				 }
		else if(msg.contains("bye")) {
			System.out.println("Goodbye, have a great day");
		}
		else {
			System.out.println("Sorry, I did not understand that");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Simple_chatbot bot = new Simple_chatbot();
		
		System.out.println("Enter you message: ");
		String str = sc.nextLine();
		
		bot.chatBot(str);
	}

}
