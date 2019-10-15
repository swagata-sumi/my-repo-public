package com.email;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class Email {

	private String first_name;
	private String last_name;
	private String password;
	private int passwordLength=8;
	private String department;
	private String alternate_email;
	private String userEmail;
	private String companyName="XYZpvt.limited";
	private int mailbox_Capacity=500;
	
	//constructor to receive firstName and lastName value
	public Email(String first_name, String last_name) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		//System.out.println("EMAIL CREATED: "+this.first_name+" "+ this.last_name);
		System.out.println("Welcome!! ");
		
		//for department call
		this.department=setDepartment();
			//System.out.println("I Work in "+this.department+" department.");
		
		//call a method that returns a random password
		this.password=setPassword(passwordLength);
		System.out.println("Hello! "+first_name+" "+last_name);
		System.out.println("your generated password: "+this.password);
		
		//your generated email..
		userEmail=first_name+"."+last_name+"@"+department+"."+companyName;
		System.out.println("your generated Email: "+userEmail);	
	}
	
	
	//generate a random password
		private String setPassword(int length) {
			String passwordString="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$&";
			char[]pswrd=new char[length];
			for (int i = 0; i <length; i++) {
				int randomvalue=(int) (Math.random() * passwordString.length());
				
				pswrd[i]=passwordString.charAt(randomvalue);
			}
			return new String(pswrd);
		}
		
		
	//when ask for the department
	private String setDepartment() {
		System.out.println("Company Departmental Codes: \n1. for SALES.\n2. for DEVELOPMENT.\n3. for ACCOUNT\n4. NONE.\n\nPlease Select Your Code: ");
		Scanner input =new Scanner(System.in);
		int userInput=input.nextInt();
		if(userInput==1) {return "sale";}
		else if(userInput==2) {return "development";}
		else if(userInput==3) {return "account";}
		else {return "";}
		
	}
	
	//set the mailbox capacity
		public void setMailboxCapacity(int capacity) {
			this.mailbox_Capacity=capacity;
			}
	//set the alternate Email
		public void setAlternateEmail(String altEmail) {
			this.alternate_email=altEmail;
		}
	//change the password
		public void setPassword(String password2) {
			this.password=password2;
		}
		
		
//...............................................................
		
	public int getMailboxCapacity() {
		return mailbox_Capacity;
	}
	
	public String getAlternateEmail() {
		return alternate_email;
	}
	
	public String setPassword() {
		return password;
	}
	
	public String showInfo() {
		return 
//				"NAME: "+first_name+" "+last_name+
				"\n\n COMPANY EMAIL: "+alternate_email+
				//"\n USER PASSWORD: "+password+
				"\n MAILBOX CAPACITY: "+mailbox_Capacity;
		
	}
}
