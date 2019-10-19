package com.studentDatabase;

import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		
//		  Student student=new Student();
		
		//these method,we can call here and also call inside a constructor
//			student.enroll();
//			student.viewBalance();
//			student.payAmount();
//			System.out.println(student.detailedInfo());
//.................................................................................................
		
	//take input from user how many student would enter 
		System.out.println("how many student would enroll? ");
		Scanner inputScanner= new Scanner(System.in);
		int number_of_student=inputScanner.nextInt();
		
		Student []students=new Student[number_of_student];  //here we create a array of object
		
	//create number of new students	
		for (int i = 0; i < number_of_student; i++) {
			
			students[i]=new Student();
			students[i].enroll();
			students[i].viewBalance();
			students[i].payAmount();
			System.out.println(students[i].detailedInfo());
		}
		
	}

}
