package com.inputoutput.example;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		try {
			String line;
			reader = new BufferedReader(new FileReader("text.pdf"));

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("An I/O error occured " + e.getMessage());
		} finally {
			try {
				if (reader != null);
				reader.close();
			} catch (IOException e) {
				System.out.println("Error closing the reader: " + e.getMessage());
			}
		}
	}

}
