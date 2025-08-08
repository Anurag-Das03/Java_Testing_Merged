package com.inputoutput.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("text.txt",true));
			writer.write("Added to the File");
			writer.newLine();
			System.out.println("Successfully written to file");
		} catch (IOException e) {
			System.out.println("Error occured while wriing to the file: " + e.getMessage());
		} finally {
			try {
				if (writer != null);
				writer.close();
			} catch (IOException e) {
				System.out.println("Error closing the reader: " + e.getMessage());
			}
		}
	}
}
