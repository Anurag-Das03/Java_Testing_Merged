package com.basicToOops;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] students = new int [3][];
		
        students[0] = new int[2];
        students[1] = new int[3];
        students[2] = new int[1];
        
        students[0][0] = 34;
        students[0][1] = 45;
        students[1][0] = 25;
        students[1][1] = 32;
        students[1][2] = 44;
        students[2][0] = 50;
        
        for (int i = 0; i < students.length; i++) {
            System.out.print("Class " + (10 + i) + ": ");
            for (int j = 0; j < students[i].length; j++) {
                System.out.print("Section " + (j + 1) + " = " + students[i][j] + " ");
            }
            System.out.println();
	}

}

}