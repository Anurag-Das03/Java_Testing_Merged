package com.inputoutput.example;

import java.io.*;

public class FileCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text.pdf");

		try {
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exist: " + file.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
