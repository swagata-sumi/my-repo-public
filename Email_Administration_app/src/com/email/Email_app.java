package com.email;


public class Email_app {
	
	public static void main(String args[]) {
		Email email=new Email("swagata", "chakraborty");
		
		email.setAlternateEmail("swagatac330@gmail.com");
//		System.out.println("\nCompany Email is-> "+email.getAlternateEmail());
		
		System.out.println(email.showInfo());
		
		
		
	}

}
