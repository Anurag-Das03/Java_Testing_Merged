package com.basicToOops;

public class Vowel_checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It is a vowel");
			break;
		default:
			System.out.println("It is a consonant");
		}
	}

}
