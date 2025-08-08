package com.basicToOops;

public class LambdaFunctionExample {

		 public static void main(String[] args) {
		 Employeee emp1 = new Employeee("emp_person1",1);
		 Employeee emp2 = new Employeee("emp_person2",2);
		 Employeee emp3 = new Employeee("emp_person3",3);
		 Employeee emp4 = new Employeee("emp_person4",4);
		 Calculator cal1 = (arr) ->{ //defination
		 BubbleSortArray ba= new BubbleSortArray();
		 ba.printArray(arr); 
		 ba.bubbleSort(arr);
		 ba.printArray(arr);
		 
		 };

		 Employeee[] employees = {emp2,emp3,emp4,emp1};

		 cal1.operation(employees);//Calling of the operation function
		 
		 }
		}

		interface Calculator{ // functional interface
		 void operation(Employeee[] employees);//description - declaration
		}



		class Employeee{
		 int salary;
		 String name;
		 Employeee(String name ,int salary){
		 this.name = name;
		 this.salary = salary;
		 }

		}



		 class BubbleSortArray {
		 public void bubbleSort(Employeee[] arr) {
		 int n = arr.length;
		 boolean swapped;

		 // Outer loop for passes
		 for (int i = 0; i < n - 1; i++) {
		 swapped = false;

		 // Inner loop for comparing adjacent elements
		 for (int j = 0; j < n - 1 - i; j++) {
		 if (arr[j].salary > arr[j + 1].salary) {
		 // Swap elements
		 int temp = arr[j].salary;
		 arr[j].salary = arr[j + 1].salary;
		 arr[j + 1].salary = temp;
		 swapped = true;
		 }
		 }

		 // Optimization: stop if no swaps occurred
		 if (!swapped) {
		 break;
		 }
		 }
		 }

		 
		 // Utility method to print array
		 public void printArray(Employeee[] arr) {
		 for (Employeee emp : arr) {
		 System.out.println(emp.name + " Salary " + emp.salary);
		 }
		 
		 }
		}