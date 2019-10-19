package com.studentDatabase;

import java.util.Scanner;

public class Student {

	private String first_name;
	private String last_name;
	private int grade_year;
	private String courses;
	private String studentID;
	private int tutionBalance=0;;
	private static int costOfCourse=600;
	private static int id=1000;
	
	//constructor: propmpt user to enter student's name and year
	public Student() {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Student First Name: ");
		this.first_name=input.nextLine();
		System.out.println("Enter Student Last Name: ");
		last_name=input.nextLine();
		System.out.println("1- freshers\n2 - sophmore\n3 - junior\n4 - senior\n\n"
				+ "Enter Student Class Level: ");
		grade_year=input.nextInt();
		
		setStudentID();
//		System.out.println(first_name+" "+last_name+"["+grade_year+"]"+" Student ID: "+studentID);	
		
	}
	
	//the student have a 5digit unique id, with the first number being their grade level;
		private void setStudentID() {
			id++;
			this.studentID=grade_year+""+id;
		}
		
	//enroll in course:
		public void enroll() {
		
			do {
					String course;
					System.out.println("Enter Course to Enroll (q to quit):");
					Scanner course_input=new Scanner(System.in);
					 course=course_input.nextLine();
					 
					if(!course.equals("q")) 
					{
						
						courses=courses+"\n                    "+course;
						tutionBalance=tutionBalance+costOfCourse;
					}
					else
					{
						   System.out.println("Thank You!!");
						   break;	
					}
			}while(1!=0);
				
					//System.out.println("Enrolled Courses: "+courses);
					//System.out.println("Tution Fee: "+tutionBalance);
			}
		
	//view balance
		public void viewBalance() {
			System.out.println("your total balance is: "+tutionBalance);
		}
		
	//pay amount
		public void payAmount() {
			int payment=0;
			Scanner scanner=new Scanner(System.in);
			System.out.println("payment amount? ");
			payment=scanner.nextInt();
			
			tutionBalance=tutionBalance-payment;
			System.out.println("thank u for ur payment of "+payment+"rs.");
			System.out.println();
			
//			System.out.println("your due balance is: "+tutionBalance);
		}
		
	//Detailed Info
		public String detailedInfo() {
			return " #STUDENT DETAILS# \n    "
		+"Name: "+first_name+" "+last_name+"\n    "
		+"Class Level: "+grade_year+"\n    "
		+"Student ID: "+studentID+"\n    "
		+"Asigned Courses: "+courses+"\n    "
		+"Due Balance: "+tutionBalance+" rs."+"\n\n";
		
		}
		
	
}
