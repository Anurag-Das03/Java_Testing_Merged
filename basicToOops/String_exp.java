package com.basicToOops;

public class String_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a String";
		String str2 = "Another String";
		String str3 = "this is a string";
		String str4 = "  Trim  ";
		String str5 = "this this is a string";
		String str6 = "";
		
		System.out.println("Length: "+ str.length());
		System.out.println("Uppercase: "+ str.toUpperCase());
		System.out.println("Lowercase: "+ str.toLowerCase());
		System.out.println("The last char is: "+ str.charAt(str.length()-1));
		System.out.println("this is a substring: "+ str.substring(0,4));
		System.out.println("Concat: "+ str.concat(" and in java String is a class"));
		
		
		System.out.println("Equals: "+ str.equals(str2));
		System.out.println("Equal Ignore Case: "+ str.equalsIgnoreCase(str2));
		System.out.println("Compare Ignore Case: "+ str.compareToIgnoreCase(str3));
		System.out.println("Compare: "+ str.compareTo(str2));
		
		System.out.println("Index of a char: "+str.indexOf('a'));
		System.out.println("Last Index of a char: "+str.lastIndexOf('i'));
		System.out.println("contains a string: "+str.contains("String"));
		System.out.println("Starts with a char: "+str.startsWith("T"));
		System.out.println("Ends of a char: "+str.startsWith("g"));
		
		System.out.println("Trimmed String: "+ str4.trim());
		System.out.println("Replace: "+str.replace("This", "It"));
		System.out.println("Replace first: "+str5.replaceFirst("this ", ""));
		
		System.out.println("Split: "+str.split("is"));
		System.out.println("Is Empty: "+str6.isEmpty());
		
		
	}

}
