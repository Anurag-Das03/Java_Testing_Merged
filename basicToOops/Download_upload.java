package com.basicToOops;

public class Download_upload {
	
	String fileName;
	double fileSize;
	String uploadBy;
	
	void upload(String name, double size, String upload) {
		fileName = name;
		fileSize = size;
		uploadBy = upload;
		
		System.out.println("File uploaded...");
	}
	
	  void download() {
	        System.out.println(" File Details: ");
	        System.out.println("File Name : " + fileName);
	        System.out.println("File Size : " + fileSize + " GB");
	        System.out.println("Uploaded By : " + uploadBy);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Download_upload obj = new Download_upload();
		
		obj.upload("file.name",3.8,"Anurag");
		obj.download();
	}

}
